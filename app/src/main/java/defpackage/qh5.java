package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes.dex */
public final class qh5 extends ObjectInputStream {
    public qh5(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, qh5.class.getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
