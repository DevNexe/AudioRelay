package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class dc5 extends bc5 {
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public dc5() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM;
        Method methodN;
        Method method2;
        Method methodO;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM = m(cls);
            methodN = n(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodO = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            methodM = null;
            methodN = null;
            method2 = null;
            methodO = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = methodM;
        this.i = methodN;
        this.j = method2;
        this.k = method;
        this.l = methodO;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // defpackage.bc5, defpackage.hc5
    public final Typeface a(Context context, u41.F1 f1, Resources resources, int i) {
        Object objNewInstance;
        if (!l()) {
            return super.a(context, f1, resources, i);
        }
        try {
            objNewInstance = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (u41.LPt8Fixed lPt8 : f1.a) {
            if (!i(context, objNewInstance, lPt8.a, lPt8.e, lPt8.b, lPt8.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(lPt8.d))) {
                try {
                    this.k.invoke(objNewInstance, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (k(objNewInstance)) {
            return j(objNewInstance);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    @Override // defpackage.bc5, defpackage.hc5
    public final Typeface b(Context context, z41[] z41VarArr, int i) {
        Object objNewInstance;
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (z41VarArr.length < 1) {
            return null;
        }
        if (!l()) {
            z41 z41VarF = f(i, z41VarArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(z41VarF.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface$Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(z41VarF.c).setItalic(z41VarF.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (z41 z41Var : z41VarArr) {
            if (z41Var.e == 0) {
                Uri uri = z41Var.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, ic5.e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        try {
            objNewInstance = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        int length = z41VarArr.length;
        int i2 = 0;
        boolean z = false;
        while (true) {
            Method method = this.k;
            if (i2 >= length) {
                if (!z) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        return null;
                    }
                }
                if (k(objNewInstance) && (typefaceJ = j(objNewInstance)) != null) {
                    return Typeface.create(typefaceJ, i);
                }
                return null;
            }
            z41 z41Var2 = z41VarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(z41Var2.a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.i.invoke(objNewInstance, byteBuffer, Integer.valueOf(z41Var2.b), null, Integer.valueOf(z41Var2.c), Integer.valueOf(z41Var2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused4) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                }
                z = true;
            }
            i2++;
        }
    }

    @Override // defpackage.hc5
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        if (!i(context, objNewInstance, str, 0, -1, -1, null)) {
            try {
                this.k.invoke(objNewInstance, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (k(objNewInstance)) {
            return j(objNewInstance);
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
