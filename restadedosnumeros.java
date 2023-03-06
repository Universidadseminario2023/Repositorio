restadedosnumeros.java


Scanner reader = new Scanner(System.in);

System.out.println("Introduce el primer número:");			
numero1 = reader.nextInt();
			
System.out.println("Introduce el segundo número:");
numero2 = reader.nextInt();

resultado = numero1-numero2;

System.out.println("La resta es " + numero1 + " - " + numero2 + " = " + resultado);