package SIGPROD2.Auxiliar;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * @author Coelho
 */
public class Arquivo {

    private String nome;
    private PrintWriter outputStream = null;
    private String texto = "";
    private BufferedReader inputStream = null;

    public Arquivo(String nomeArquivo) {        
        setNome(nomeArquivo);
    }

    public Arquivo(String nomeArquivo, String texto) {
        setNome(nomeArquivo);
        criaArquivo();
        escreverArquivo(texto);
    }

    private void setNome(String nomeArquivo) {
        this.nome = nomeArquivo;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean criaArquivo() {
        try {
            outputStream = new PrintWriter(new FileOutputStream(getNome()));
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public void fechaArquivoSaida() {
        getArquivoSaida().close();
    }

    public void fechaArquivoEntrada() {
        if (inputStream != null) {
            try {
                getArquivoEntrada().close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void escreverArquivo(String textoArquivo) {
        this.texto = textoArquivo;
        getArquivoSaida().print(this.texto);
        outputStream.flush();
    }

    public PrintWriter getArquivoSaida() {
        if (outputStream == null) {
            criaArquivo();
        }
        return outputStream;
    }

    public BufferedReader getArquivoEntrada() {
        if (inputStream == null) {
            abreArquivo();
        }
        return inputStream;
    }

    public boolean abreArquivo() {
        if (!(new File(getNome())).exists()) {
            return false;
        } else {
            try {
                inputStream = new BufferedReader(new FileReader(getNome()));
                return true;
            } catch (IOException ex) {
                return false;
            }
        }
    }
    
    public String lerArquivo() {
        final StringBuilder stringBuilder = new StringBuilder();

        try {
            final File file = new File(getNome());

            final FileChannel fileChannel = new RandomAccessFile(file, "r").getChannel();
            final ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            final CharsetDecoder charsetDecoder = Charset.forName("UTF-8").newDecoder();

            while (fileChannel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                CharBuffer ch = charsetDecoder.decode(byteBuffer);

                stringBuilder.append(ch);
                byteBuffer.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
    
    public void substituiArquivo(String novoTexto) {
        File arquivo = new File(getNome());
        arquivo.delete();

        arquivo = new File(getNome());
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        abreArquivo();
        escreverArquivo(novoTexto);
        fechaArquivoSaida();
    }

    public boolean apagarArquivo() {
        File arquivo = new File(getNome());
        if (existeArquivo()) {
            fechaArquivoEntrada();
            return arquivo.delete();
        }
        return false;
    }

    public boolean existeArquivo() {
        return (new File(getNome())).exists();
    }

    public boolean apagaArquivo() {
        return (new File(getNome())).delete();
    }
    
    public boolean podeLerArquivo() {
        return (new File(getNome())).canRead();
    }    

    public boolean podeEscreverArquivo() {
        return (new File(getNome())).canWrite();
    }    
    
    public boolean ehDiretorio() {
        return (new File(getNome()).isDirectory());
    }

    void apagaArquivosDiretorio() {
        if (ehDiretorio()) {
            File arquivos[] = new File(getNome()).listFiles();
            
            for (int i = 0; i < arquivos.length; i++) {
                File arquivo = arquivos[i];
                
                arquivo.delete();
            }
        }
    }
}
