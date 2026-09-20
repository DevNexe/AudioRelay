package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t41 {
    public static final t62<String, Typeface> a = new t62<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final ok4<String, ArrayList<n70<QnHx>>> d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new hp3());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ok4<>();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[EDGE_INSN: B:21:0x0034->B:25:0x003c BREAK  A[LOOP:0: B:17:0x002a->B:23:0x0038]] */
    public static QnHx a(String str, Context context, o41 o41Var, int i) {
        int i2;
        t62<String, Typeface> t62Var = a;
        Typeface typefaceB = t62Var.b(str);
        if (typefaceB != null) {
            return new QnHx(typefaceB);
        }
        try {
            y41 y41VarA = n41.a(context, o41Var);
            int i3 = 1;
            z41[] z41VarArr = y41VarA.b;
            int i4 = y41VarA.a;
            if (i4 != 0) {
                if (i4 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else {
                if (z41VarArr == null || z41VarArr.length == 0) {
                    i2 = i3;
                    break;
                }
                int length = z41VarArr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = i3;
                        break;
                    }
                    int i6 = z41VarArr[i5].e;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i2 = i6;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                    i5++;
                }
            }
            if (i2 != 0) {
                return new QnHx(i2);
            }
            Typeface typefaceB2 = ac5.a.b(context, z41VarArr, i);
            if (typefaceB2 == null) {
                return new QnHx(-3);
            }
            t62Var.c(str, typefaceB2);
            return new QnHx(typefaceB2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new QnHx(-1);
        }
    }

    public static final class QnHx {
        public final Typeface a;
        public final int b;

        public QnHx(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public QnHx(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
