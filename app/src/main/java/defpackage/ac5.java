package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ac5 {
    public static final hc5 a;
    public static final t62<String, Typeface> b;

    public static class QnHx extends kK {
        public final sp3.NUlFixed A;

        public QnHx(sp3.NUlFixed nUl) {
            this.A = nUl;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new fc5();
        } else if (i >= 28) {
            a = new ec5();
        } else if (i >= 26) {
            a = new dc5();
        } else if (i < 24) {
            a = new bc5();
        } else {
            Method method = cc5.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new cc5();
            } else {
                a = new bc5();
            }
        }
        b = new t62<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    public static Typeface a(Context context, u41.CQf cQf, Resources resources, int i, String str, int i2, int i3, sp3.NUlFixed nUl, boolean z) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        if (cQf instanceof u41.NUlFixed) {
            u41.NUlFixed nUl2 = (u41.NUlFixed) cQf;
            String str2 = nUl2.d;
            typefaceA = null;
            boolean z2 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (nUl != null) {
                    nUl.b(typefaceCreate);
                }
                return typefaceCreate;
            }
            if (!z ? nUl == null : nUl2.c == 0) {
                z2 = true;
            }
            int i4 = z ? nUl2.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            QnHx qnHx = new QnHx(nUl);
            o41 o41Var = nUl2.a;
            fm fmVar = new fm(qnHx, handler);
            if (z2) {
                t62<String, Typeface> t62Var = t41.a;
                String str3 = o41Var.e + "-" + i3;
                Typeface typefaceB = t41.a.b(str3);
                if (typefaceB != null) {
                    handler.post(new cm(qnHx, typefaceB));
                    typefaceA = typefaceB;
                } else if (i4 == -1) {
                    t41.QnHx qnHxA = t41.a(str3, context, o41Var, i3);
                    fmVar.a(qnHxA);
                    typefaceA = qnHxA.a;
                } else {
                    try {
                        try {
                            try {
                                t41.QnHx qnHx2 = (t41.QnHx) t41.b.submit(new p41(str3, context, o41Var, i3)).get(i4, TimeUnit.MILLISECONDS);
                                fmVar.a(qnHx2);
                                typefaceA = qnHx2.a;
                            } catch (InterruptedException e) {
                                throw e;
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        fmVar.b.post(new em(fmVar.a, -3));
                    }
                }
            } else {
                t62<String, Typeface> t62Var2 = t41.a;
                String str4 = o41Var.e + "-" + i3;
                Typeface typefaceB2 = t41.a.b(str4);
                if (typefaceB2 != null) {
                    handler.post(new cm(qnHx, typefaceB2));
                    typefaceA = typefaceB2;
                } else {
                    q41 q41Var = new q41(fmVar);
                    synchronized (t41.c) {
                        ok4<String, ArrayList<n70<t41.QnHx>>> ok4Var = t41.d;
                        ArrayList<n70<t41.QnHx>> orDefault = ok4Var.getOrDefault(str4, null);
                        if (orDefault != null) {
                            orDefault.add(q41Var);
                        } else {
                            ArrayList<n70<t41.QnHx>> arrayList = new ArrayList<>();
                            arrayList.add(q41Var);
                            ok4Var.put(str4, arrayList);
                            t41.b.execute(new ip3(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new r41(str4, context, o41Var, i3), new s41(str4)));
                        }
                    }
                }
            }
        } else {
            typefaceA = a.a(context, (u41.F1) cQf, resources, i3);
            if (nUl != null) {
                if (typefaceA != null) {
                    nUl.b(typefaceA);
                } else {
                    nUl.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.c(b(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
