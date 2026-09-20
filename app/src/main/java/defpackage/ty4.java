package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.QnHx;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class ty4 implements d54 {
    public static final String x = s52.e("SystemAlarmScheduler");
    public final Context w;

    public ty4(Context context) {
        this.w = context.getApplicationContext();
    }

    @Override // defpackage.d54
    public final void a(WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            s52.c().a(x, String.format("Scheduling work with workSpecId %s", workSpec.a), new Throwable[0]);
            String str = workSpec.a;
            Context context = this.w;
            context.startService(QnHx.b(context, str));
        }
    }

    @Override // defpackage.d54
    public final boolean b() {
        return true;
    }

    @Override // defpackage.d54
    public final void d(String str) {
        String str2 = QnHx.z;
        Context context = this.w;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }
}
