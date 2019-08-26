package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ActivatorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, April 10, 2015 11:48:02 AM PDT
*/

public interface ActivatorOperations 
{

  // A new ORB started server registers itself with the Activator
  void active (int serverId, com.sun.corba.se.spi.activation.Server serverObj) throws com.sun.corba.se.spi.activation.ServerNotRegistered;

  // Install a particular kind of endpoint
  void registerEndpoints (int serverId, String orbId, com.sun.corba.se.spi.activation.EndPointInfo[] endPointInfo) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.NoSuchEndPoint, com.sun.corba.se.spi.activation.ORBAlreadyRegistered;

  // list active servers
  int[] getActiveServers ();

  // If the server is not running, start it up.
  void activate (int serverId) throws com.sun.corba.se.spi.activation.ServerAlreadyActive, com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown;

  // If the server is running, shut it down
  void shutdown (int serverId) throws com.sun.corba.se.spi.activation.ServerNotActive, com.sun.corba.se.spi.activation.ServerNotRegistered;

  // currently running, this method will activate it.
  void install (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown, com.sun.corba.se.spi.activation.ServerAlreadyInstalled;

  // list all registered ORBs for a server
  String[] getORBNames (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered;

  // After this hook completes, the server may still be running.
  void uninstall (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown, com.sun.corba.se.spi.activation.ServerAlreadyUninstalled;
} // interface ActivatorOperations
