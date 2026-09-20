package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u27 implements IqU {
    public static u27 c;
    public final Context a;
    public final ExecutorService b;

    public u27(Context context) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.b = Executors.newSingleThreadExecutor();
        this.a = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new o17(this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final void b(Context context) throws l17 {
        if (context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new l17("Failed to store the app set ID last used time.");
    }

    @Override // defpackage.IqU
    public final w05<HB> a() {
        z05 z05Var = new z05();
        this.b.execute(new iq5(this, z05Var, 6));
        return z05Var.a;
    }
}
