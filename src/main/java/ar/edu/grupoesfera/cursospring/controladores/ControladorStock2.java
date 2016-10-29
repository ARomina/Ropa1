/*package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ColeccionProducto;
import ar.edu.grupoesfera.cursospring.modelo.Producto;
import ar.edu.grupoesfera.cursospring.modelo.Stock3;
import ar.edu.grupoesfera.cursospring.servicios.StockServicio;

@RestController
public class ControladorStock {

		@Inject
		private StockServicio servicioStock;
		
		//Ver pantalla de agregar/revertir stock
		@RequestMapping ("/agregarRevertirStock")
		public ModelAndView pantallaBuscarvVerStock(@ModelAttribute("stock") Stock3 stock,
				                                    @ModelAttribute("producto") Producto producto ){
			ModelMap modelo = new ModelMap();
			String info;
			info = "AGREGAR STOCK";
			Stock3 servicioStock = Stock3.getInstance();
			try{
				servicioStock.buscarId(idProducto, producto);
				info="PRODUCTO ENCONTRADO";
			}catch(Exception e){
				info= e.getMessage();
			}
			modelo.put("info", info);
			modelo.put("servicioStock", servicioStock.verStock());
			return new ModelAndView ("agregarRevertirStock", modelo);
		}
		/*
		//Al apretar buscar, lleva a esto
		//recibe el codigo, 
		@RequestMapping (value = "/stockResultadoBusqueda")
		public ModelAndView buscarEnStock(@ModelAttribute("stock")Stock listaStock, //AGREGUE
										  @ModelAttribute("producto") Producto producto, //ANTES NO ESTABA
				                          @RequestParam (value="idProducto")Integer idProducto){
			String info;
			Stock servicioStock = Stock.getInstance();
			ModelMap modelo = new ModelMap();
				try{
					servicioStock.buscarId(idProducto, producto);
					info="PRODUCTO ENCONTRADO";
				}catch(Exception e){
					info= e.getMessage();
				}
		
			modelo.put("info", info);
			modelo.put("servicioStock", servicioStock.verStock());
			return new ModelAndView ("stockResultadoBusqueda", modelo);
		}*/
		
		//Ver listado del stock 
		/*@RequestMapping ("/verStock")
		public ModelAndView verStock(@ModelAttribute("producto") Producto producto){
			ModelMap modelo = new ModelMap();
			Stock3 servicioStock = Stock3.getInstance();
			modelo.put("servicioStock", servicioStock.verStock());
			return new ModelAndView ("verStock", modelo);
		}
		
		/*LISTADO DE PRODUCTOS*//*
		@RequestMapping (value = "/verProductos")
		public ModelAndView verProductos(@ModelAttribute("producto")Producto producto){
			ModelMap modelo = new ModelMap();
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			modelo.put("servicioproducto", servicioproducto.verProductos());
			return new ModelAndView ("verProductos", modelo);
		}

		/*BAJA Y MODIFICACION DE PRODUCTO*//*
		@RequestMapping (value = "/bajaOmodifPro")
		public ModelAndView bajaOmodifPro(@ModelAttribute("producto")Producto producto){
			ModelMap modelo = new ModelMap();
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			modelo.put("productos", servicioproducto.verProductos());
			return new ModelAndView ("/bajaOmodifPro", modelo);
		}
		
		/*BAJA DE PRODUCTO*//*
		@RequestMapping (value = "/bajaProConfirma")
		public ModelAndView bajaProConfirma(@ModelAttribute("producto")Producto producto,
									              @RequestParam (value="id")Integer id){
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			ModelMap modelo = new ModelMap();
			servicioproducto.guardaProductoExistente(producto);
			modelo.put("id",producto.getId());
			modelo.put("categoria",producto.getCategoria());	
			modelo.put("nombreProducto",producto.getNombreProducto());
			modelo.put("color",producto.getColor());
			modelo.put("talle",producto.getTalle());
			modelo.put("precio",producto.getPrecio());
			return new ModelAndView ("/bajaProConfirma", modelo);
		}
		
		@RequestMapping (value = "/bajaProOk")
		public ModelAndView bajaProOk(@ModelAttribute("producto")Producto producto){
			String info;
			String boton="Eliminar Otro";
			ModelMap modelo = new ModelMap();
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			try{
				servicioproducto.bajaProducto(producto);
			info="BAJA DE PRODUCTO EXITOSA";
			}catch(Exception e){
				info= e.getMessage();
			}
			modelo.put("info", info);
			modelo.put("boton", boton);
			modelo.put("productos", servicioproducto.verProductos());
			return new ModelAndView ("/bajaOmodifProOk", modelo);
		}
		
		/*MODIFICACION DE PRODUCTO*//*
		@RequestMapping (value = "/modifProConfirma")
		public ModelAndView modifProConfirma(@ModelAttribute("producto")Producto producto,
									              @RequestParam (value="id")Integer id){
			String info="MODIFICACIÓN DE PRODUCTO";
			String boton="Modificar";
			ModelMap modelo = new ModelMap();
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			servicioproducto.guardaProductoExistente(producto);
			modelo.put("info", info);
			modelo.put("boton", boton);
			return new ModelAndView ("/modifProConfirma", modelo);
		}
		
		@RequestMapping (path = "/modifProOk")
		public ModelAndView modifProOk(@ModelAttribute("producto")Producto producto,
							           @RequestParam (value="id")Integer id){
			String info;
			String boton="Modificar Otro";
			ModelMap modelo = new ModelMap();
			ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
			servicioproducto.modificacionProducto(producto);	
			info="MODIFICACION DE PRODUCTO EXITOSA";		
			modelo.put("info", info);
			modelo.put("boton", boton);
			modelo.put("productos", servicioproducto.verProductos());
			return new ModelAndView ("/bajaOmodifProOk", modelo);
		}
		*/
		
		
		
		
		//Getters y Setters

		/*public StockServicio getServicioStock() {
			return servicioStock;
		}

		public void setServicioStock(StockServicio servicioStock) {
			this.servicioStock = servicioStock;
		}
		
		
		//----------------INTENTOS FALLIDOSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
		//Buscar codigo ingresado y retornar si hay PRODUCTO
				/*@RequestMapping (path = "/stockResultadoBusqueda", method = RequestMethod.POST)
				public ModelAndView verProductoSiHayStock(@ModelAttribute("producto")Producto producto,
											              @RequestParam (value="idProd")Integer idProd){
					String info;
					ModelMap modelo = new ModelMap();
					ColeccionProducto productos = ColeccionProducto.getInstance();
					Stock servicioStock = Stock.getInstance();
					try{
						servicioStock.buscarId(producto);
					    info="PRODUCTO ENCONTRADO";
					}catch(Exception e){
						info= e.getMessage();
					}
					modelo.put("info", info);
					modelo.put("producto", servicioStock.verStock());
					return new ModelAndView ("/stockResultadoBusqueda", modelo);
				}*//*
				@RequestMapping (value = "/stockResultadoBusqueda", method = RequestMethod.POST)
				public ModelAndView verProductoSiHayStock(@ModelAttribute("producto")Producto producto,
												@RequestParam (value="idProd")Integer idProd){
					String info;
					ModelMap modelo = new ModelMap();
					//ColeccionProducto productos = ColeccionProducto.getInstance();
					Stock servicioStock = Stock.getInstance();
					try{
						servicioStock.buscarId(idProd, producto);
						info = "PRODUCTO ENCONTRADO";
					}catch(Exception e){
						//info = "PRODUCTO NO ENCONTRADO";
						info= e.getMessage();
					}
					modelo.put("idproducto", idProd);
					modelo.put("info", info);
					return new ModelAndView ("stockResultadoBusqueda", modelo);
				}
				/*
				@RequestMapping (path = "/modifUsuOk")
				public ModelAndView modifUsuOk(@ModelAttribute("usuario")Usuario usuario,
			            					   @RequestParam (value="eMail")String eMail){
					String info;
					String boton="Modificar Otro";
					ModelMap modelo = new ModelMap();
					ColeccionUsuario serviciousuario = ColeccionUsuario.getInstance();
					serviciousuario.modificacionUsuario(usuario);	
					info="MODIFICACION DE USUARIO EXITOSA";		
					modelo.put("info", info);
					modelo.put("boton", boton);
					modelo.put("usuarios", serviciousuario.verUsuarios());
					return new ModelAndView ("/bajaOmodifUsuOk", modelo);
				}
				
				/*
				//Buscar stock
				@RequestMapping (value = "/stockResultadoBusqueda", method = RequestMethod.POST)
				public ModelAndView buscarStock(@ModelAttribute("producto")Producto producto,
												@RequestParam (value="idproducto")Integer idproducto){
					String info;
					Stock servicioStock = Stock.getInstance();
					ModelMap modelo = new ModelMap();
					try{
						servicioStock.ingresoIdStock(idproducto);
						info = "PRODUCTO ENCONTRADO";
					}catch(Exception e){
						info = "PRODUCTO NO ENCONTRADO";
					}
					modelo.put("idproducto", idproducto);
					modelo.put("info", info);
					return new ModelAndView ("stockResultadoBusqueda", modelo);
				}
					/*
					try{
						servicioStock.ingresoIdStock(idproducto);
						info="PRODUCTO ENCONTRADO";
					}catch(Exception e){
						servicioStock.verStock();
						info=e.getMessage();
					}
					modelo.put("idproducto", idproducto);
					modelo.put("info", info);
					return new ModelAndView ("stockResultadoBusqueda", modelo);
				}
				
				/*
				@RequestMapping (value = "/bajaProConfirma")
				public ModelAndView bajaProConfirma(@ModelAttribute("producto")Producto producto,
											              @RequestParam (value="id")Integer id){
					ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
					ModelMap modelo = new ModelMap();
					servicioproducto.guardaProductoExistente(producto);
					modelo.put("id",producto.getId());
					modelo.put("categoria",producto.getCategoria());	
					modelo.put("nombreProducto",producto.getNombreProducto());
					modelo.put("color",producto.getColor());
					modelo.put("talle",producto.getTalle());
					modelo.put("precio",producto.getPrecio());
					return new ModelAndView ("/bajaProConfirma", modelo);
				}
				
				/*
				//Buscar y agregar o revertir stock
				@RequestMapping (path="/agregarRevertirStock", method = RequestMethod.POST)
				public ModelAndView buscarStock(@ModelAttribute("idproducto")Producto producto){
					String info= "AGREGAR STOCK";
					Stock servicioStock = Stock.getInstance();
					ModelMap modelo = new ModelMap();
					try{
						servicioStock.ingresoIdStock(producto);
						info="PRODUCTO ENCONTRADO";
					}catch(Exception e){
						servicioStock.verStock();
						info=e.getMessage();
					}
					modelo.put("info", info);
					return new ModelAndView ("agregarRevertirStock", modelo);
				}
				/*
				//Ver listado del stock
				@RequestMapping ("/verStock")
				public ModelAndView verStock(@ModelAttribute("producto") Producto producto){
					ModelMap modelo = new ModelMap();
					//ColeccionProducto servicioproducto = ColeccionProducto.getInstance();
					//Stock servicioStock = Stock.getInstance();
					//modelo.put("servicioStock", servicioStock.verStock());
					return new ModelAndView ("verStock", modelo);
				}*/
/*	
}*/

