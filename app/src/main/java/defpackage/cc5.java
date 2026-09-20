package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cc5 extends hc5 {
    public static final Class<?> a;
    public static final Constructor<?> b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.hc5
    public final Typeface a(Context context, u41.F1 f1, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (u41.LPt8Fixed lPt8 : f1.a) {
            int i2 = lPt8.f;
            File fileD = ic5.d(context);
            if (fileD == null) {
                map = null;
            } else {
                try {
                    if (ic5.b(fileD, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileD);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                        fileD.delete();
                    } else {
                        fileD.delete();
                        map = null;
                    }
                } catch (Throwable th3) {
                    fileD.delete();
                    throw th3;
                }
            }
            if (map == null || !g(objNewInstance, map, lPt8.e, lPt8.b, lPt8.c)) {
                return null;
            }
        }
        try {
            Object objNewInstance2 = Array.newInstance(a, 1);
            Array.set(objNewInstance2, 0, objNewInstance);
            return (Typeface) d.invoke(null, objNewInstance2);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // defpackage.hc5
    public final Typeface b(Context context, z41[] z41VarArr, int i) {
        Object objNewInstance;
        Typeface typeface;
        try {
            objNewInstance = b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        ok4 ok4Var = new ok4();
        for (z41 z41Var : z41VarArr) {
            Uri uri = z41Var.a;
            ByteBuffer byteBufferE = (ByteBuffer) ok4Var.getOrDefault(uri, null);
            if (byteBufferE == null) {
                byteBufferE = ic5.e(context, uri);
                ok4Var.put(uri, byteBufferE);
            }
            if (byteBufferE == null || !g(objNewInstance, byteBufferE, z41Var.b, z41Var.c, z41Var.d)) {
                return null;
            }
        }
        try {
            Object objNewInstance2 = Array.newInstance(a, 1);
            Array.set(objNewInstance2, 0, objNewInstance);
            typeface = (Typeface) d.invoke(null, objNewInstance2);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}
