package defpackage;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class j50 {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final f50 c;
    public final f50 d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j50(ExecutorService executorService, f50 f50Var, f50 f50Var2) {
        this.b = executorService;
        this.c = f50Var;
        this.d = f50Var2;
    }

    public static g50 a(f50 f50Var) {
        synchronized (f50Var) {
            kc7 kc7Var = f50Var.c;
            if (kc7Var != null && kc7Var.n()) {
                return (g50) f50Var.c.k();
            }
            try {
                return (g50) f50.a(f50Var.b(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                return null;
            }
        }
    }
}
