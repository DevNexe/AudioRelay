package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import defpackage.oa3;
import defpackage.ra1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteCreator<T> {
    public final String a;
    public Object b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException() {
            super("Could not get remote context.");
        }

        public RemoteCreatorException(String str, ReflectiveOperationException reflectiveOperationException) {
            super(str, reflectiveOperationException);
        }
    }

    public RemoteCreator(String str) {
        this.a = str;
    }

    public abstract T a(IBinder iBinder);

    public final T b(Context context) throws RemoteCreatorException {
        Context contextCreatePackageContext;
        if (this.b == null) {
            oa3.h(context);
            AtomicBoolean atomicBoolean = ra1.a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreatorException();
            }
            try {
                this.b = a((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (T) this.b;
    }
}
