package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import defpackage.Fxu4;
import defpackage.cn5;
import defpackage.co2;
import defpackage.dv0;
import defpackage.h70;
import defpackage.hz4;
import defpackage.nn5;
import defpackage.s52;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements dv0 {
    public static final String z = s52.e("CommandHandler");
    public final Context w;
    public final HashMap x = new HashMap();
    public final Object y = new Object();

    public QnHx(Context context) {
        this.w = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z2) {
        synchronized (this.y) {
            dv0 dv0Var = (dv0) this.x.remove(str);
            if (dv0Var != null) {
                dv0Var.c(str, z2);
            }
        }
    }

    public final void d(int i, Intent intent, LPt8Fixed lPt8) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s52.c().a(z, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            CQf cQf = new CQf(this.w, i, lPt8);
            ArrayList<WorkSpec> arrayListE = ((androidx.work.impl.model.CQf) lPt8.A.y.n()).e();
            String str = ConstraintProxy.a;
            Iterator it = arrayListE.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                h70 h70Var = ((WorkSpec) it.next()).j;
                z2 |= h70Var.d;
                z3 |= h70Var.b;
                z4 |= h70Var.e;
                z5 |= h70Var.a != co2.NOT_REQUIRED;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = cQf.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            cn5 cn5Var = cQf.c;
            cn5Var.b(arrayListE);
            ArrayList arrayList = new ArrayList(arrayListE.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : arrayListE) {
                String str3 = workSpec.a;
                if (jCurrentTimeMillis >= workSpec.a() && (!workSpec.b() || cn5Var.a(str3))) {
                    arrayList.add(workSpec);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((WorkSpec) it2.next()).a;
                Intent intentA = a(context, str4);
                s52.c().a(CQf.d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                lPt8.e(new LPt8Fixed.CQf(cQf.b, intentA, lPt8));
            }
            cn5Var.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s52.c().a(z, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            lPt8.A.Z0();
            return;
        }
        Bundle extras = intent.getExtras();
        if (!((extras == null || extras.isEmpty() || extras.get(new String[]{"KEY_WORKSPEC_ID"}[0]) == null) ? false : true)) {
            s52.c().b(z, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = z;
            s52.c().a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = lPt8.A.y;
            workDatabase.c();
            try {
                WorkSpec workSpecI = ((androidx.work.impl.model.CQf) workDatabase.n()).i(string);
                if (workSpecI == null) {
                    s52.c().f(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (workSpecI.b.a()) {
                    s52.c().f(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jA = workSpecI.a();
                    boolean zB = workSpecI.b();
                    Context context2 = this.w;
                    nn5 nn5Var = lPt8.A;
                    if (zB) {
                        s52.c().a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        Fxu4.b(context2, nn5Var, string, jA);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        lPt8.e(new LPt8Fixed.CQf(i, intent3, lPt8));
                    } else {
                        s52.c().a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                        Fxu4.b(context2, nn5Var, string, jA);
                    }
                    workDatabase.h();
                }
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.y) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                s52 s52VarC = s52.c();
                String str6 = z;
                s52VarC.a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (this.x.containsKey(string2)) {
                    s52.c().a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                } else {
                    F1 f1 = new F1(this.w, i, string2, lPt8);
                    this.x.put(string2, f1);
                    f1.d();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s52.c().f(z, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            s52.c().a(z, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c(string3, z6);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        s52.c().a(z, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        lPt8.A.b1(string4);
        String str7 = Fxu4.a;
        hz4 hz4Var = (hz4) lPt8.A.y.k();
        SystemIdInfo systemIdInfoA = hz4Var.a(string4);
        if (systemIdInfoA != null) {
            Fxu4.a(this.w, string4, systemIdInfoA.b);
            s52.c().a(Fxu4.a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            hz4Var.b(string4);
        }
        lPt8.c(string4, false);
    }
}
