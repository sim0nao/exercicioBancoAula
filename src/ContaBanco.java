
public class ContaBanco {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String cliente;
    private double saldo;
    private Boolean status;
    
    public void mostraStatus(){
        System.out.println("------------------");
        System.out.println(this.getNumConta());
        System.out.println(this.getCliente());
        System.out.println(this.getStatus());
        System.out.println(this.getSaldo());
        
    }
    
    //Métodos Especiais
    public void ContaBanco(){ //método construtor
        
    }
    
    public void setnumConta(int n){
    n = this.numConta;
}
    public int getnumConta (){
       return this.numConta;
    }
    
    public void setTipo(String tipo){
       tipo=this.tipo;
    }
    
    public String getTipo (){
        return this.tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    //Métodos Especificos
    public void abrirConta (String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals (t)){
            this.setSaldo(60);
        }
        else if ( "CP" .equals (t)){
            this.setSaldo (150);
        }
        
    }
       
    
    public void fecharConta (){
       if (this.getSaldo() != 0){
           System.out.println("Desculpe, a conta não pode ser fechada. Procure a agência mais próxima");
        } else {
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso!");
           }  
    }
    
    public void depositar (double v){
       if (this.getStatus() == true){
       this.setSaldo(this.getSaldo() + v);
       
       } else{
           System.out.println("Conta não encontrada ");
       }
    }
    
    public void sacar (double v){
        if (this.getStatus() == true){
            if (this.getSaldo() >= v ) {
                this.setSaldo (this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getCliente());
            }else {
                System.out.println("Saldo insuficiente");
                        }
        }else{
            System.out.println("Conta não encontrada ");
        }
    }
    
}
