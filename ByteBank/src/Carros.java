

	public class Carros{
	    private int ano;
	    private String modelo;
	    private double precio;
	    
	    
	
	    public Carros(int ano, String modelo, double precio){
	    	
	        if(ano >= 1891){
	            this.ano = ano;
	        }else{
	            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
	            this.ano = 2017;
	        }

	        if( modelo != null){
	            this.modelo = modelo;
	        }else{
	            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
	            this.modelo = "Gol";
	        }

	        if(precio > 0){
	            this.precio = precio;
	        }else{
	            System.out.println("EL precio no es válido. Por eso usaremos 40000.0!");
	            this.precio = 40000.0;
	        }
	    }

	    //Nuevo constructor AQUI!
	    public Carros(String modelo, double precio){
	        this(2017, modelo, precio);
	    }

	    //getters e setters omitidos
	    public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

	}

