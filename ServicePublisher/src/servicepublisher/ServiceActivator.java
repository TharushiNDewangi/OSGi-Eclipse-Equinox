package servicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServiceActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		//ServiceActivator.context = bundleContext;
		System.out.print("publisher Start @@@@@@@ ");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		//ServiceActivator.context = null;
		System.out.print("publisher Stop @@@@@@@ ");
	}

}
