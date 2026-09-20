package hu.akarnokd.rxjava2.debug;

/* JADX INFO: loaded from: classes3.dex */
public final class RxJavaAssemblyException extends RuntimeException {
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    public RxJavaAssemblyException() {
        boolean z;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getLineNumber() != 1) {
                String className = stackTraceElement.getClassName();
                z = (className.contains("java.lang.Thread") || className.contains("junit.runner") || className.contains("org.junit.internal") || className.contains("junit4.runner") || className.contains("java.lang.reflect") || className.contains("sun.reflect") || className.contains(".RxJavaAssemblyException") || className.contains("OnAssembly") || className.contains("RxJavaAssemblyTracking") || className.contains("RxJavaPlugins")) ? false : true;
            }
            if (z) {
                stackTraceElement.toString();
            }
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
