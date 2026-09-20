package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xg4 implements rh4 {
    public final Context a;
    public final sh4 b;
    public final ta2 c;
    public final m57 d;
    public final pq2 e;
    public final xi5 f;
    public final oe0 g;
    public final AtomicReference<qg4> h;
    public final AtomicReference<z05<qg4>> i;

    public xg4(Context context, sh4 sh4Var, m57 m57Var, ta2 ta2Var, pq2 pq2Var, xi5 xi5Var, oe0 oe0Var) {
        AtomicReference<qg4> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new z05());
        this.a = context;
        this.b = sh4Var;
        this.d = m57Var;
        this.c = ta2Var;
        this.e = pq2Var;
        this.f = xi5Var;
        this.g = oe0Var;
        atomicReference.set(uh0.b(m57Var));
    }

    public static void b(String str, JSONObject jSONObject) {
        StringBuilder sbG = Md5A.g(str);
        sbG.append(jSONObject.toString());
        String string = sbG.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #1 {Exception -> 0x0056, blocks: (B:23:0x0049, B:25:0x0051), top: B:39:0x0049 }] */
    public final qg4 a(int i) {
        qg4 qg4Var = null;
        try {
            if (!O.c(2, i)) {
                JSONObject jSONObjectL = this.e.l();
                if (jSONObjectL != null) {
                    qg4 qg4VarH = this.c.h(jSONObjectL);
                    if (qg4VarH != null) {
                        b("Loaded cached settings: ", jSONObjectL);
                        this.d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (O.c(3, i)) {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                qg4Var = qg4VarH;
                            } catch (Exception e) {
                                e = e;
                                qg4Var = qg4VarH;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                        } else {
                            if (!(qg4VarH.c < jCurrentTimeMillis)) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                                }
                                qg4Var = qg4VarH;
                            } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            }
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return qg4Var;
    }
}
