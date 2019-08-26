package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/IORInfoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Friday, April 10, 2015 11:48:12 AM PDT
*/


/**
   * Provides the server-side ORB service with access to the applicable 
   * policies during IOR construction and the ability to add components. 
   * The ORB passes an instance of its implementation of this interface as 
   * a parameter to <code>IORInterceptor.establish_components</code>.
   *
   * @see IORInterceptor
   */
public interface IORInfoOperations 
{

  /**
       * Allows an ORB service implementation to determine what server side 
       * policy of a particular type is in effect for an IOR being 
       * constructed.  When the IOR being constructed is for an object 
       * implemented using a POA, all Policy objects passed to the 
       * <code>PortableServer.POA.create_POA</code> call that created that 
       * POA are accessable via <code>get_effective_policy</code>. 
       * <p>
       * If a policy for the given type is not known to the ORB, then this 
       * operation will throw <code>INV_POLICY</code> with a standard minor 
       * code of 2. 
       * 
       * @param type an int specifying the type of policy to return. 
       * @return The effective <code>CORBA.Policy</code> object of the 
       *     requested type. If the given policy type is known, but no policy 
       *     of that type is in effect, then this operation will return a 
       *     nil object reference.
       */
  org.omg.CORBA.Policy get_effective_policy (int type);

  /**
       * A portable ORB service implementation calls 
       * <code>add_ior_component</code> from its implementation of 
       * <code>establish_components</code> to add a tagged component to the 
       * set which will be included when constructing IORs. The components in 
       * this set will be included in all profiles. 
       * <p>
       * Any number of components may exist with the same component ID. 
       * 
       * @param tagged_component The IOP.TaggedComponent to add.
       */
  void add_ior_component (org.omg.IOP.TaggedComponent tagged_component);

  /**
       * A portable ORB service implementation calls 
       * <code>add_ior_component_to_profile</code> from its implementation of 
       * <code>establish_components</code> to add a tagged component to the 
       * set which will be included when constructing IORs. The components in 
       * this set will be included in the specified profile. 
       * <p>
       * Any number of components may exist with the same component ID. 
       * 
       * @param tagged_component The <code>IOP.TaggedComponent</code> to add. 
       * @param profile_id The profile id of the profile to 
       *     which this component will be added.
       * @exception BAD_PARAM thrown, with a standard minor code of 29, if the 
       *     given profile ID does not define a known profile or it is 
       *     impossible to add components to that profile.
       */
  void add_ior_component_to_profile (org.omg.IOP.TaggedComponent tagged_component, int profile_id);

  /** Return the adapter manager id of the object adapter
       * that was just created and is running IOR interceptors.
       */
  int manager_id ();

  /** Return the adapter state of the object adapter
       * that was just created and is running IOR interceptors.
       */
  short state ();

  /** Return the object reference template of the object adapter
       * that was just created and is running IOR interceptors.
       */
  org.omg.PortableInterceptor.ObjectReferenceTemplate adapter_template ();

  /** On read, returns the current factory that will be used to create
       * object references for the object adapter that was just created
       * and is running IOR interceptors.  By default, this factory is the same
       * as the value of the adapter_template attribute.  The current_factory 
       * may also be set to another object reference template inside an
       * IORInterceptor_3_0.
       */
  org.omg.PortableInterceptor.ObjectReferenceFactory current_factory ();

  /** On read, returns the current factory that will be used to create
       * object references for the object adapter that was just created
       * and is running IOR interceptors.  By default, this factory is the same
       * as the value of the adapter_template attribute.  The current_factory 
       * may also be set to another object reference template inside an
       * IORInterceptor_3_0.
       */
  void current_factory (org.omg.PortableInterceptor.ObjectReferenceFactory newCurrent_factory);
} // interface IORInfoOperations
