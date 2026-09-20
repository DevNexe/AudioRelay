package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class hc5 {

    public interface QnHx<T> {
        int a(T t);

        boolean b(T t);
    }

    public hc5() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i, QnHx<T> qnHx) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(qnHx.a(t2) - i2) * 2) + (qnHx.b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    public Typeface a(Context context, u41.F1 f1, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, z41[] z41VarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File fileD = ic5.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (ic5.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileD = ic5.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (ic5.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public z41 f(int i, z41[] z41VarArr) {
        return (z41) e(z41VarArr, i, new gc5());
    }
}
