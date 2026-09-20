package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class sf5 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static sf5 d;
    public final lf0 a;

    public sf5(lf0 lf0Var) {
        this.a = lf0Var;
    }

    public final boolean a(z3 z3Var) {
        if (TextUtils.isEmpty(z3Var.d)) {
            return true;
        }
        long j = z3Var.f + z3Var.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
