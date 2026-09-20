package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ay6 {
    public static final Object f = new Object();

    @Nullable
    public static volatile tw6 g;
    public static final AtomicInteger h;
    public final tx6 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;

    static {
        new AtomicReference();
        h = new AtomicInteger();
    }

    public /* synthetic */ ay6(tx6 tx6Var, String str, Object obj) {
        if (tx6Var.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = tx6Var;
        this.b = str;
        this.c = obj;
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    public final Object b() {
        by6 by6Var;
        ex6 ex6VarA;
        Object objA;
        gx6 gx6Var;
        int i = h.get();
        if (this.d < i) {
            synchronized (this) {
                try {
                    if (this.d < i) {
                        tw6 tw6Var = g;
                        if (tw6Var == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        tx6 tx6Var = this.a;
                        tx6Var.getClass();
                        String str = null;
                        if (tx6Var.a == null) {
                            this.a.getClass();
                            UserManager userManager = rw6.a;
                            if (Build.VERSION.SDK_INT >= 24) {
                                throw null;
                            }
                            synchronized (by6.class) {
                                by6Var = (by6) by6.a.getOrDefault(null, null);
                                if (by6Var == null) {
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        throw null;
                                    } catch (Throwable th) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                            ex6VarA = by6Var;
                        } else if (jx6.a(tw6Var.a, this.a.a)) {
                            this.a.getClass();
                            ex6VarA = xw6.a(tw6Var.a.getContentResolver(), this.a.a, new Runnable() { // from class: nx6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ay6.h.incrementAndGet();
                                }
                            });
                        } else {
                            ex6VarA = null;
                        }
                        if (ex6VarA != null) {
                            this.a.getClass();
                            Object objZzb = ex6VarA.zzb(this.b);
                            if (objZzb != null) {
                                objA = a(objZzb);
                            } else {
                                objA = null;
                            }
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (this.a.b) {
                                objA = null;
                            } else {
                                Context context = tw6Var.a;
                                synchronized (gx6.class) {
                                    if (gx6.c == null) {
                                        gx6.c = OW8.j(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new gx6(context) : new gx6();
                                    }
                                    gx6Var = gx6.c;
                                }
                                String strA = gx6Var.zzb(this.a.b ? null : this.b);
                                if (strA != null) {
                                    objA = a(strA);
                                } else {
                                    objA = null;
                                }
                            }
                            if (objA == null) {
                                objA = this.c;
                            }
                        }
                        hy6 hy6Var = (hy6) tw6Var.b.zza();
                        if (hy6Var.b()) {
                            ax6 ax6Var = (ax6) hy6Var.a();
                            Uri uri = this.a.a;
                            String str2 = this.b;
                            ax6Var.getClass();
                            if (uri != null) {
                                ok4 ok4Var = (ok4) ax6Var.a.getOrDefault(uri.toString(), null);
                                if (ok4Var != null) {
                                    str = (String) ok4Var.getOrDefault("".concat(String.valueOf(str2)), null);
                                }
                            }
                            objA = str == null ? this.c : a(str);
                        }
                        this.e = objA;
                        this.d = i;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.e;
    }
}
