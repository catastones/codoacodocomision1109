let container = document.getElementById("seccion");
let pagar_layer;
const comprarTicket=()=>{
    container.innerHTML=`
                 <article class="container">
                <div class="row">
                    <div class=" col col-md-10 offset-md-1 col-lg-8 offset-lg-2 pt-2">
                        <di class="card-group">
                            <div class="card m-1">
                                <div class="card-body border border-primary ">
                                    <h5 class="card-title text-center">Estudiante</h5>
                                    <p class="card-text text-center">Tienen un descuento</p>
                                    <p class="card-title text-center fw-bold">80%</p>
                                    <p class="card-text text-center"><small>* presentar documentación</small></p>
                                </div>
                            </div>

                            <div class="card m-1">
                                <div class="card-body border border-primary ">
                                    <h5 class="card-title text-center">Tarinee</h5>
                                    <p class="card-text text-center">Tienen un descuento</p>
                                    <p class="card-title text-center fw-bold">50%</p>
                                    <p class="card-text text-center"><small>* presentar documentación</small></p>
                                </div>
                            </div>

                            <div class="card m-1">
                                <div class="card-body border  border-warning ">
                                    <h5 class="card-title text-center">Junior</h5>
                                    <p class="card-text text-center">Tienen un descuento</p>
                                    <p class="card-title text-center fw-bold">15%</p>
                                    <p class="card-text text-center"><small>* presentar documentación</small></p>
                                </div>
                            </div>
                        </di>


                    </div>
                </div>
                <div class="row">
                    <div class="col text-uppercase text-center">
                        <small>venta</small>
                        <h2> valor de ticket</h2>


                    </div>
                </div>
                <div class="row">
                    <div class="col col-md-10 offset-md-2 col-lg-8 offset-lg-2 pt-2">
                        <form action="">
                            <div class="row">
                                <div class="col">
                                  <input type="text" class="form-control" placeholder="Nombre" aria-label="First name">
                                </div>
                                <div class="col">
                                  <input type="text" class="form-control" placeholder="Apellido" aria-label="Last name">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col mt-2">
                                    <input type="email" class="form-control" placeholder="Correo" >

                                </div>
                                
                            </div>
                            <div class="row ">
                                <div class="col mt-2">
                                    <label for="Cantidad" class="form-label">Cantidad</label>
                                  <input id="Cantidad" type="text" class="form-control" placeholder="Cantidad" >
                                </div>
                                <div class="col mt-2">
                                    <label for="Categoria" class="form-label">Categoria</label>
                                  <select id="Categoria" class="form-select" aria-label="Default select example">
                                      <!-- <option selected>Estudiante</option> -->
                                      <option value="1">Estudiante</option>
                                      <option value="2">Trainee</option>
                                      <option value="3">Junior</option>
                                    </select>
                                </div>
                            </div>
                            <div id="pagar" class="form-row mt-3">
                               


                            </div>
                            <div class="form-row d-flex mt-3">
                                <button class="btn btn-lg btn-primary col-6 m-1 sendcolor">Borrar</button>
                                <button class="btn btn-lg btn-primary col-6 m-1 sendcolor" onclick="resumen()">Resumen</button>


                            </div>
                            

                            
                            
                        </form>
                    </div>
                </div>
            </article>
    
    `;

pagar_layer = document.getElementById("pagar");
   
};

 const resumen=()=>{
        
    let inputCantidad = document.getElementById("Cantidad").value
    let inputCategoria = document.getElementById("Categoria").value
    let categoria = 0;

switch (inputCategoria) {
    case '1':
        categoria =200 - 200*0.80;
        break;
    case '3':
        categoria =200 - 200*0.15;
        break;
    case '2':
        categoria =200 - 200*0.50;
        break;
    
}
console.log(inputCategoria);
    let resultado = inputCantidad * categoria;



    pagar_layer.innerHTML=`
     <div class="alert alert-primary" role="alert">
                                    Cantidad a pagar: $ ${resultado}
                                </div>`;


    }