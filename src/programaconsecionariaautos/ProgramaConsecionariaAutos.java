/*
 *Bienvenido al Programa de una Consecionaria de Automóviles.
 *Este programa pretende ayudar en la administración de ventas de los autos de la empresa.
 *La concesionaria tiene clasificados sus vehículos en distintas gamas, cada una con un precio base.
 *Los clientes pueden solicitar ciertas mejoras o amenidades en su vehículo con un costo extra.
 *Este programa fué realizado por: Luis Angel Díaz Alvarado. 
 */
package programaconsecionariaautos;//Nombre del paquete que identifica a este programa.
import java.io.*;//Import, para importar las diferentes clases que va a utilizar el programa. "import java.io", es el encargado de gestionar las operaciones de entrada/salida.
public class ProgramaConsecionariaAutos //El programa usa la clase ProgramaConsecionariaAutos. 
{//Inicio de la clase ProgramaConsecionariaAutos.
    
 //Con el método main empieza la ejecución de la aplicación en Java.
    public static void main(String[] args) throws IOException //La palabra clave throws indica que un determinado método puede "lanzar" una determinada excepción, necesitando manejar una posible IOException. 
    {//Inicio del método main. 
        
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));//BufferedReader, es una clase que lee el texto de una secuencia de entradavcomo un archivo que va almacenando como caracteres.
	int eleccione;//Declaraciones de Variables.
	int seeccione;//Declaraciones de Variables.
	int selccione;//Declaraciones de Variables.
	int seleccioe;//Declaraciones de Variables.
	int seleccion = 0;//Declaraciones de Variables.
	int seleccionar;//Declaraciones de Variables.
	int seleccionar_mejora_accesorios_electronicos;//Declaraciones de Variables.
	int seleccionar_mejora_accesorios_exteriores;//Declaraciones de Variables.
	int seleccionar_mejora_accesorios_interiores;//Declaraciones de Variables.
	int seleccionar_mejora_del_color;//Declaraciones de Variables.
	int seleccionar_mejora_del_color_tapiceria;//Declaraciones de Variables.
	int seleccionar_mejora_de_los_aros;//Declaraciones de Variables.
	int seleccionar_tipo_de_transmision;//Declaraciones de Variables.
	int seleccione = 0;//Declaraciones de Variables.
	int seleccionne;//Declaraciones de Variables.
	int seleeccione;//Declaraciones de Variables.
	int sleccione;//Declaraciones de Variables.
	String tipos_accesorios_electronicos;//Declaraciones de Variables.
	String tipos_accesorios_electrónicos;//Declaraciones de Variables.
	String tipos_accesorios_exteriores;//Declaraciones de Variables.
	String tipos_accesorios_interiores;//Declaraciones de Variables.
	String tipo_aros;//Declaraciones de Variables.
	String tipo_color_tap;//Declaraciones de Variables.
	String tipo_de_color;//Declaraciones de Variables.
	String tipo_de_transmision;//Declaraciones de Variables.
	String ventas_autos;//Declaraciones de Variables.
	String ventas_carros;//Declaraciones de Variables.
	String venta_carro;//Declaraciones de Variables.
	 System.out.println("Seleccione el Vehículo de la Gama que desee");//Indicador.
	 System.out.println("1)Gama Sedan Económico 18,940.00");//Clasificación de las disntintas gamas de autos. 
	 System.out.println("2)Gama Sedán 23,570.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("3)Gama Deportivo 24,100.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("4)Gama Híbrido 25,100.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("5)Gama Coupe 19,350.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("6)Gama Coupe Deportivo 24,100.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("7)Gama Compacto 16,190.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("8)Gama Hatchback 20,150.00");//Clasificación de las disntintas gamas de autos.
	 System.out.println("9)Gama Económico versión Rally 34,700.0");//Clasificación de las disntintas gamas de autos.
	 System.out.println("Ingrese el número de su selección:");//Indicador.
	 seleccionar = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado. 
                
		if (seleccionar==1)//Aplicación del uso del if para la toma de decisiones.  
                {//Inicio del if en este primer auto.
			venta_carro = "1)Gama Económica Sedan 18,940.00";//Si le elije la primer gama, operación correspondiente.
			System.out.println("1)Gama Económica Sedan 18,940.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión para el usuario.
			System.out.println("Ingrese 1: Si");//Opción 1. 
			System.out.println("Ingrese 2: No");//Opción 2.
			seleccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en esta primera clasificación.
				System.out.println("Seleccione su mejora en el Tipo de Transmision, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Manual 0.00");//Clasificación de las disntintas amenidades en el Tipo de Transmisión.
				System.out.println("2)CVT 800.00");//Clasificación de las disntintas amenidades en el Tipo de Transmisión.
				System.out.println("3)Manual con Turbo 0.00");//Clasificación de las disntintas amenidades en el Tipo de Transmisión.
				System.out.println("4)CVT con Turbo 800.00");//Clasificación de las disntintas amenidades en el Tipo de Transmisión.
				System.out.println("Ingrese el número de su selección");//Indicador.
				seleccionar_tipo_de_transmision = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_tipo_de_transmision==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipo_de_transmision = "1)Manual 0.00";//Selección realizada.
					System.out.println("1)Manual 0.00");//Resultado de la selección realizada. 
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta primera clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en esta segunda clasificación.
				System.out.println("Seleccione su mejora del Color de Pintura Exterior, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Cosmic Blue 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("2)Burgundy Night 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("3)Rallye Red 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("4)Crystal Black 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("5)Modern Steel 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("6)Taffeta Withe 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("7)Energy Green 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("8)Kona Coffe 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("9)Orange Fury 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("10)Helios Yellow 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("11)Sonic Gray 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("12)Polished Metal 0.00");//Clasificación de las disntintas amenidades en el Color de Pintura Exterior.
				System.out.println("Ingrese el número de su selección");//Indicador.
				seleccionar_mejora_del_color = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_del_color==1)//Aplicación del uso del if para la toma de decisiones.
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipo_de_color = "1)Cosmic Blue 0.00";//Selección realizada.
					System.out.println("1)Cosmic Blue 0.00");//Resultado de la selección realizada. 
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta segunda clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en esta tercera clasificación.
				System.out.println("Seleccione su mejora en el Color de Tapicería, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Gray Cloth 0.00");//Clasificación de las disntintas amenidades en el Color de Tapicería.
				System.out.println("2)Black Cloth 0.00");//Clasificación de las disntintas amenidades en el Color de Tapicería.
				System.out.println("3)Black/Gray Cloth 0.00");//Clasificación de las disntintas amenidades en el Color de Tapicería.
				System.out.println("4)Red/Black Suede Effect-Fabric 0.00");//Clasificación de las disntintas amenidades en el Color de Tapicería.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_del_color_tapiceria = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_del_color_tapiceria==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipo_color_tap = "1)Gray Cloth 0.00";//Selección realizada.
					System.out.println("1)Gray Cloth 0.00");//Resultado de la selección realizada. 
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta tercera clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión
                        {//Inicio del if en esta cuarta clasificación.
				System.out.println("Seleccione su mejora en los Aros, si no lo requiere ingrese 0:");//Indicador
				System.out.println("1)15 0.00");//Clasificación de las disntintas amenidades en los Aros.
				System.out.println("2)16 0.00");//Clasificación de las disntintas amenidades en los Aros.
				System.out.println("3)17 0.00");//Clasificación de las disntintas amenidades en los Aros.
				System.out.println("4)18 0.00");//Clasificación de las disntintas amenidades en los Aros.
				System.out.println("5)19 0.00");//Clasificación de las disntintas amenidades en los Aros.
				System.out.println("Ingrese el número de su selección");//Indicador.
				seleccionar_mejora_de_los_aros = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_de_los_aros==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipo_aros = "1)15 0.00";//Selección realizada.
					System.out.println("1)15 0.00");//Resultado de la selección realizada. 
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta cuarta clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en esta quinta clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Exteriores, si no lo requiere ingrese 0:");//Indicador. 
				System.out.println("1)BodySide Molding 217.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("2)Car Cover 230.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("3)Deckild Spoiler 299.99");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("4)Door Edge Film 42.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("5)Door Edge Guards 84.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("6)Door Edge Chrome 285.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("7)Door Visor 185.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("8)Front Fender Emblems 50.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("9)Rear Bumper Applique 70.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("10)Fog Lights 325.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("11)Nose Mascs 158.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("12)Moonrof Visor 138.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("13)Splash Guard Set 104.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("14)Dust Cover 350.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("15)Door Mirror Cover-Carbon Fiber 520.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_accesorios_exteriores = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_accesorios_exteriores==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipos_accesorios_exteriores = "1)BodySide Molding 217.00";//Selección realizada.
					System.out.println("1)BodySide Molding 217.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta quinta clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en esta sexta clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Interiores, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)All-Seasons Floor Mats 142.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("2)Automatic.Dimning Mirror 219.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("3)DCargo Hock 12.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("4)Cargo Net 49.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("5)Console Illumination 250.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("6)Cargo Organizer 87.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("7)Door Panel Protector 149.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("8)Armrest Compartiment 337.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("9)Door Sill Trim-Illuminated 290.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("10)Cargo Cover 166.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("11)Cargo Liner 187.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("Ingrese el número de su selección");//Indicador.
				seleccionar_mejora_accesorios_interiores = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_accesorios_interiores==1)//Aplicación del uso del if para la toma de decisiones.  
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipos_accesorios_interiores = "1)All-Seasons Floor Mats 142.00";//Selección realizada.
					System.out.println("1)All-Seasons Floor Mats 142.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta sexta clasificación.
			if (seleccione==1)//Aplicación del uso del if para la toma de esta decisión.  
                        {//Inicio del if en esta séptima clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Electrónicos, si no lo requiere ingrese 0:");//Indicador. 
				System.out.println("1)Wireless Phone Charger 305.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("2)USB Charger -2.1 Amp 120.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("3)Puddle Light 185.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("4)Parking Sensors 514.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_accesorios_electronicos = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_accesorios_electronicos==1)//Aplicación del uso del if para la toma de decisiones.   
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación. 
					tipos_accesorios_electronicos = "1)Wireless Phone Charger 305.00";//Selección realizada.
					System.out.println("1)Wireless Phone Charger 305.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta séptima clasificación.
		}//Fin del if del primer auto. 
                
		if (seleccione==2)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en la decisión del no. 
			System.out.println("1)Gama Sedan Económico 18,940.00");//Resultado de la selección realizada.
		}//Fin del if en la decisión del no. 
                
		if (seleccionar==2)//Aplicación del uso del if para la toma de esta decisión.  
                {//Inicio del if en este segundo auto. 
			ventas_carros = "2)Gama Sedán 23,570.00";//Si se elije la segunda gama, operación correspondiente. 
			System.out.println("2)Gama Sedán 23,570.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario. 
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2. 
			seleccion = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado. 
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en esta primera clasificación. 
				System.out.println("Seleccione su mejora en el Tipo de Transmision, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Manual 0.00");//Clasificación de las distintas amenidades en el Tipo de Transmisión.
				System.out.println("2)CVT 800.00");//Clasificación de las distintas amenidades en el Tipo de Transmisión.
				System.out.println("3)Manual con Turbo 0.00");//Clasificación de las distintas amenidades en el Tipo de Transmisión.
				System.out.println("4)CVT con Turbo 800.00");//Clasificación de las distintas amenidades en el Tipo de Transmisión.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_tipo_de_transmision = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_tipo_de_transmision==1)//Aplicación del uso del if para la toma de decisiones.
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipo_de_transmision = "1)Manual 0.00";//Selección Realizada. 
					System.out.println("1)Manual 0.00");//Resultado de la selección realizada. 
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta primera clasificación. 
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en esta segunda clasificación. 
				System.out.println("Seleccione su mejora del Color de Pintura Exterior, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Cosmic Blue 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("2)Burgundy Night 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("3)Rallye Red 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("4)Crystal Black 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("5)Modern Steel 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("6)Taffeta Withe 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("7)Energy Green 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("8)Kona Coffe 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("9)Orange Fury 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("10)Helios Yellow 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("11)Sonic Gray 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("12)Polished Metal 0.00");//Clasificación de las distintas amenidades en el Color de Pintura Exterior.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_del_color = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_del_color==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipo_de_color = "1)Cosmic Blue 0.00";//Selección Realizada.
					System.out.println("1)Cosmic Blue 0.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta segunda calsificación.
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en esta tercera clasificación.
				System.out.println("Seleccione su mejora en el Color de Tapicería, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Gray Cloth 0.00");//Clasificación de las distintas amenidades en el Color de Tapicería.
				System.out.println("2)Black Cloth 0.00");//Clasificación de las distintas amenidades en el Color de Tapicería.
				System.out.println("3)Black/Gray Cloth 0.00");//Clasificación de las distintas amenidades en el Color de Tapicería.
				System.out.println("4)Red/Black Suede Effect-Fabric 0.00");//Clasificación de las distintas amenidades en el Color de Tapicería.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_del_color_tapiceria = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_del_color_tapiceria==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipo_color_tap = "1)Gray Cloth 0.00";//Selección Realizada.
					System.out.println("1)Gray Cloth 0.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta tercera clasificación.
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión.  
                        {//Inicio del if en esta cuarta clasificación.
				System.out.println("Seleccione su mejora en los Aros, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)15 0.00");//Clasificación de las distintas amenidades en los Aros.
				System.out.println("2)16 0.00");//Clasificación de las distintas amenidades en los Aros.
				System.out.println("3)17 0.00");//Clasificación de las distintas amenidades en los Aros.
				System.out.println("4)18 0.00");//Clasificación de las distintas amenidades en los Aros.
				System.out.println("5)19 0.00");//Clasificación de las distintas amenidades en los Aros.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_de_los_aros = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_de_los_aros==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipo_aros = "1)15 0.00";//Selección Realizada.
					System.out.println("1)15 0.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta cuarta calsificación.
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión.   
                        {//Inicio del if en esta quinta clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Exteriores, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)BodySide Molding 217.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("2)Car Cover 230.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("3)Deckild Spoiler 299.99");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("4)Door Edge Film 42.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("5)Door Edge Guards 84.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("6)Door Edge Chrome 285.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("7)Door Visor 185.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("8)Front Fender Emblems 50.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("9)Rear Bumper Applique 70.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("10)Fog Lights 325.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("11)Nose Mascs 158.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("12)Moonrof Visor 138.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("13)Splash Guard Set 104.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("14)Dust Cover 350.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("15)Door Mirror Cover-Carbon Fiber 520.00");//Clasificación de las distintas amenidades en los Accesorios Exteriores.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_accesorios_exteriores = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_accesorios_exteriores==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipos_accesorios_exteriores = "1)BodySide Molding 217.00";//Selección Realizada.
					System.out.println("1)BodySide Molding 217.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta quinta clasificación.
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión.  
                        {//Inicio del if en esta sexta clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Interiores, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)All-Seasons Floor Mats 142.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("2)Automatic.Dimning Mirror 219.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("3)DCargo Hock 12.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("4)Cargo Net 49.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("5)Console Illumination 250.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("6)Cargo Organizer 87.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("7)Door Panel Protector 149.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("8)Armrest Compartiment 337.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("9)Door Sill Trim-Illuminated 290.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("10)Cargo Cover 166.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("11)Cargo Liner 187.00");//Clasificación de las distintas amenidades en los Accesorios Interiores.
				System.out.println("Ingrese el número de su selección");//Indicador.
				seleccionar_mejora_accesorios_interiores = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
				if (seleccionar_mejora_accesorios_interiores==1)//Aplicación del uso del if para la toma de decisiones. 
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipos_accesorios_interiores = "1)All-Seasons Floor Mats 142.00";//Selección Realizada.
					System.out.println("1)All-Seasons Floor Mats 142.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta sexta clasificación.
			if (seleccion==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en esta séptima clasificación.
				System.out.println("Seleccione su mejora para los Accesorios Electrónicos, si no lo requiere ingrese 0:");//Indicador.
				System.out.println("1)Wireless Phone Charger 305.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("2)USB Charger -2.1 Amp 120.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("3)Puddle Light 185.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("4)Parking Sensors 514.00");//Clasificación de las distintas amenidades en los Accesorios Electrónicos.
				System.out.println("Ingrese el número de su selección");//Indicador. 
				seleccionar_mejora_accesorios_electronicos = Integer.parseInt(bufEntrada.readLine());
				if (seleccionar_mejora_accesorios_electronicos==1)//Aplicación del uso del if para la toma de decisiones.  
                                {//Inicio del if al haber elegido la primera amenidad de esta clasificación.
					tipos_accesorios_electronicos = "1)Wireless Phone Charger 305.00";//Selección Realizada.
					System.out.println("1)Wireless Phone Charger 305.00");//Resultado de la selección realizada.
				}//Fin del if al haber elegido la primera amenidad de esta clasificación.
			}//Fin del if en esta séptima clasificación.
		}//Fin del if en este segundo auto.
                
		if (seleccion==2)//Aplicación del uso del if para la toma de esta decisión.
                {//Inicio del if en la decisión del no.
			System.out.println("2)Gama Sedán 23,570.00");//Resultado de la selección realizada.
		}//Fin del if en la decisión del no.
                
               /*Acá inicia solo el código con la opción de elegir una de las distintas gamas 
               *y las opciones de continuar con las amenidades ya no se continua, solo con la aclaración que en 
               *ese lugar se eligieran muchos de los distintos elementos de las clasificaciones. 
               */
		
		if (seleccionar==3)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en este tercer auto.
			venta_carro = "3)Gama Deportivo 24,100.00";//Si le elije la tercer gama, operación correspondiente.
			System.out.println("3)Gama Deportivo 24,100.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			selccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (selccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("Ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración. 
			}//Final del if.
			if (selccione==2)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en la decisión del no.
				System.out.println("3)Gama Deportivo 24,100.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este tercer auto.
                
		if (seleccionar==4)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en este cuarto auto.
			venta_carro = "4)Gama Híbrido 25,100.00";//Si le elije la cuarta gama, operación correspondiente.
			System.out.println("4)Gama Híbrido 25,100.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			sleccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (sleccione==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("Ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración. 
			}//Final del if.
			if (sleccione==2)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en la decisión del no.
				System.out.println("4)Gama Híbrida 25,100.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este cuarto auto.
                
		if (seleccionar==5)//Aplicación del uso del if para la toma de esta decisión.  
                {//Inicio del if en este quinto auto.
			venta_carro = "5)Gama Coupe 19,350.00";//Si le elije la quinta gama, operación correspondiente.
			System.out.println("5)Gama Coupe 19,350.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			seeccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (seeccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración. 
			}//Final del if.
			if (seeccione==2)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en la decisión del no.
				System.out.println("5)Gama Coupe 19,350.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este quinto auto.
                
		if (seleccionar==6)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en este sexto auto.
			venta_carro = "6)Gama Coupe Deportivo  24,100.00";//Si le elije la sexta gama, operación correspondiente.
			System.out.println("6)Gama Coupe Deportivo 24,100.00");//Gama seleccionada. 
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			seleccioe = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (seleccioe==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración. 
			}//Final del if.
			if (seleccioe==2)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if en la decisión del no.
				System.out.println("6)Gama Coupe Deportivo 24,100.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este sexto auto.
                
		if (seleccionar==7)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en este séptimo auto.
			venta_carro = "7) Gama Compacto 16,190.00";//Si le elije la sexta gama, operación correspondiente.
			System.out.println("7) Gama Compacto 16,190.00");//Gama seleccionada.
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			eleccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (eleccione==1)//Aplicación del uso del if para la toma de esta decisión.
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración.
			}//Final del if.
			if (eleccione==2)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if en la decisión del no.
				System.out.println("7) Gama Compacto 16,190.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este séptimo auto.
                
		if (seleccionar==8)//Aplicación del uso del if para la toma de esta decisión. 
                {//Inicio del if en este octavo auto.
			venta_carro = "8)Gama Hatchback 20,150.00";//Si le elije la sexta gama, operación correspondiente.
			System.out.println("8)Gama Hatchback 20,150.00");//Gama seleccionada.
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			seleccionne = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (seleccionne==1)//Aplicación del uso del if para la toma de esta decisión. 
                        {//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
				System.out.println("ingrese sus mejoras o amenidades");//Descripción por si se contaran con amenidades a elegir. 
				System.out.println("Acá iría el proceso de las amenidades a escoger");//Aclaración.
			}//Final del if.
			if (seleccionne==2)//Aplicación del uso del if para la toma de esta decisión.  
                        {//Inicio del if en la decisión del no.
				System.out.println("8)Gama Hatchback 20,150.00");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este octavo auto.
		if (seleccionar==9)//Aplicación del uso del if para la toma de esta decisión.  
                {//Inicio del if en este noveno auto.
			venta_carro = "9)Gama Economico Versión Rally 34,700.0";//Si le elije la sexta gama, operación correspondiente.
			System.out.println("9)Gama Economico Versión Rally 34,700.0");//Gama seleccionada.
			System.out.println("¿Desea mejorar su Vehículo?");//Decisión del usuario.
			System.out.println("Ingrese 1: Si");//Opción 1.
			System.out.println("Ingrese 2: No");//Opción 2.
			seleeccione = Integer.parseInt(bufEntrada.readLine());//Operación para saber lo que se ha seleccionado.
			if (seleeccione==1)//Aplicación del uso del if para la toma de esta decisión.  
                        {
				System.out.println("ingrese sus mejoras o amenidades");
				System.out.println("Acá iría el proceso de las amenidades a escoger");
			}//Inicio del if, con anterioridad se explicaba la razón por la que no se tiene a opción las distintas amenidades. 
			if (seleeccione==2)//Aplicación del uso del if para la toma de esta decisión.  
                        {//Inicio del if en la decisión del no.
				System.out.println("9)Gama Economico Versión Rally 34,700.0");//Resultado de la selección realizada.
			}//Fin del if en la decisión del no.
		}//Fin del if en este noveno auto.
    }//Fin del método main.
}//Fin de la clase ProgramaConsecionariaAutos.
