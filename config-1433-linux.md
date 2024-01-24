# Para configurar SQL Server para aceptar conexiones remotas a través del puerto 1433, podemos seguir estos pasos:
1. Abre el archivo /var/opt/mssql/mssql.conf en un editor de texto. Puedes usar sudo nano o cualquier otro editor que prefieras.
   
```
   sudo nano /var/opt/mssql/mssql.conf
```
Asegúrate de que la configuración enabled esté establecida en true. Si no lo está, cámbiala y guarda el archivo.

```
   enabled = true
```
Guarda los cambios y cierra el editor.

2. Configura el Firewall:
   Asegúrate de que el firewall permita el tráfico a través del puerto 1433. Puedes hacerlo usando el comando ufw en sistemas que lo admitan.
   
```
   sudo ufw allow 1433
```

3. Reinicia el Servicio de SQL Server:
   Después de realizar cambios en la configuración, es necesario reiniciar el servicio de SQL Server para que los cambios surtan efecto.
   
```
   sudo systemctl restart mssql-server
```
4. Verifica la Configuración:
   Puedes verificar si SQL Server está escuchando en el puerto 1433 utilizando el siguiente comando:
```
   ss -nlt | grep 1433
```
Asegúrate de que la salida muestre algo como:

``
   LISTEN   0         128       *:1433                  *:*
``
