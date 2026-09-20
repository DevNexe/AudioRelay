package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.model.WorkSpec;
import defpackage.ao5;
import defpackage.bn5;
import defpackage.cn5;
import defpackage.dv0;
import defpackage.il5;
import defpackage.s52;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements bn5, dv0, ao5.CQf {
    public static final String F = s52.e("DelayMetCommandHandler");
    public final cn5 A;
    public PowerManager.WakeLock D;
    public final Context w;
    public final int x;
    public final String y;
    public final LPt8Fixed z;
    public boolean E = false;
    public int C = 0;
    public final Object B = new Object();

    public F1(Context context, int i, String str, LPt8Fixed lPt8) {
        this.w = context;
        this.x = i;
        this.z = lPt8;
        this.y = str;
        this.A = new cn5(context, lPt8.x, this);
    }

    @Override // ao5.CQf
    public final void a(String str) {
        s52.c().a(F, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    public final void b() {
        synchronized (this.B) {
            this.A.c();
            this.z.y.b(this.y);
            PowerManager.WakeLock wakeLock = this.D;
            if (wakeLock != null && wakeLock.isHeld()) {
                s52.c().a(F, String.format("Releasing wakelock %s for WorkSpec %s", this.D, this.y), new Throwable[0]);
                this.D.release();
            }
        }
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        s52.c().a(F, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        b();
        int i = this.x;
        LPt8Fixed lPt8 = this.z;
        Context context = this.w;
        if (z) {
            lPt8.e(new LPt8Fixed.CQf(i, QnHx.b(context, this.y), lPt8));
        }
        if (this.E) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            lPt8.e(new LPt8Fixed.CQf(i, intent, lPt8));
        }
    }

    public final void d() {
        String str = this.y;
        this.D = il5.a(this.w, String.format("%s (%s)", str, Integer.valueOf(this.x)));
        s52 s52VarC = s52.c();
        Object[] objArr = {this.D, str};
        String str2 = F;
        s52VarC.a(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.D.acquire();
        WorkSpec workSpecI = ((androidx.work.impl.model.CQf) this.z.A.y.n()).i(str);
        if (workSpecI == null) {
            g();
            return;
        }
        boolean zB = workSpecI.b();
        this.E = zB;
        if (zB) {
            this.A.b(Collections.singletonList(workSpecI));
        } else {
            s52.c().a(str2, String.format("No constraints for %s", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // defpackage.bn5
    public final void e(ArrayList arrayList) {
        g();
    }

    @Override // defpackage.bn5
    public final void f(List<String> list) {
        if (list.contains(this.y)) {
            synchronized (this.B) {
                if (this.C == 0) {
                    this.C = 1;
                    s52.c().a(F, String.format("onAllConstraintsMet for %s", this.y), new Throwable[0]);
                    if (this.z.z.f(this.y, null)) {
                        this.z.y.a(this.y, this);
                    } else {
                        b();
                    }
                } else {
                    s52.c().a(F, String.format("Already started work for %s", this.y), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.B) {
            if (this.C < 2) {
                this.C = 2;
                s52 s52VarC = s52.c();
                String str = F;
                s52VarC.a(str, String.format("Stopping work for WorkSpec %s", this.y), new Throwable[0]);
                Context context = this.w;
                String str2 = this.y;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                LPt8Fixed lPt8 = this.z;
                lPt8.e(new LPt8Fixed.CQf(this.x, intent, lPt8));
                if (this.z.z.d(this.y)) {
                    s52.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.y), new Throwable[0]);
                    Intent intentB = QnHx.b(this.w, this.y);
                    LPt8Fixed lPt9 = this.z;
                    lPt9.e(new LPt8Fixed.CQf(this.x, intentB, lPt9));
                } else {
                    s52.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.y), new Throwable[0]);
                }
            } else {
                s52.c().a(F, String.format("Already stopped work for %s", this.y), new Throwable[0]);
            }
        }
    }
}
