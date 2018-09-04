## Configuring JBoss Fuse

1. Download and unzip the [JBoss Fuse 6.3.0 zip](https://developers.redhat.com/download-manager/file/jboss-fuse-karaf-6.3.0.redhat-187.zip) from RedHat, 
you will need a RedHat account for this
2. Start JBoss Fuse:
	- **Linux**
		- Change to the `jboss-fuse-karaf-6.3.0.redhat-187/bin` directory
		- Run the fuse binary: `./fuse`
	- **Windows**
		- Run the `jboss-fuse-karaf-6.3.0.redhat-187/bin/fuse.bat` file
3. Wait until you have access to the client:
```bash
      _ ____                  ______
     | |  _ \                |  ____|             
     | | |_) | ___  ___ ___  | |__ _   _ ___  ___
 _   | |  _ < / _ \/ __/ __| |  __| | | / __|/ _ \
| |__| | |_) | (_) \__ \__ \ | |  | |_| \__ \  __/
 \____/|____/ \___/|___/___/ |_|   \__,_|___/\___|

  JBoss Fuse (6.3.0.redhat-187)
  http://www.redhat.com/products/jbossenterprisemiddleware/fuse/

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.

Open a browser to http://localhost:8181 to access the management console

Create a new Fabric via 'fabric:create'
or join an existing Fabric via 'fabric:join [someUrls]'

Hit '<ctrl-d>' or 'osgi:shutdown' to shutdown JBoss Fuse.

JBossFuse:admin@root> 
```
