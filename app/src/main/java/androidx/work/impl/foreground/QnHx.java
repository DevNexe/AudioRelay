package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.model.WorkSpec;
import defpackage.bn5;
import defpackage.c15;
import defpackage.cn5;
import defpackage.cz4;
import defpackage.dv0;
import defpackage.dz4;
import defpackage.ez4;
import defpackage.g51;
import defpackage.nn5;
import defpackage.on5;
import defpackage.s52;
import defpackage.yt4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements bn5, dv0 {
    public static final String F = s52.e("SystemFgDispatcher");
    public final LinkedHashMap A;
    public final HashMap B;
    public final HashSet C;
    public final cn5 D;
    public InterfaceC0035QnHx E;
    public final nn5 w;
    public final c15 x;
    public final Object y = new Object();
    public String z;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.QnHx$QnHx, reason: collision with other inner class name */
    public interface InterfaceC0035QnHx {
    }

    public QnHx(Context context) {
        nn5 nn5VarW0 = nn5.W0(context);
        this.w = nn5VarW0;
        c15 c15Var = nn5VarW0.z;
        this.x = c15Var;
        this.z = null;
        this.A = new LinkedHashMap();
        this.C = new HashSet();
        this.B = new HashMap();
        this.D = new cn5(context, c15Var, this);
        nn5VarW0.B.a(this);
    }

    public static Intent a(Context context, String str, g51 g51Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", g51Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g51Var.b);
        intent.putExtra("KEY_NOTIFICATION", g51Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str, g51 g51Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", g51Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g51Var.b);
        intent.putExtra("KEY_NOTIFICATION", g51Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.y) {
            try {
                WorkSpec workSpec = (WorkSpec) this.B.remove(str);
                if (workSpec != null ? this.C.remove(workSpec) : false) {
                    this.D.b(this.C);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g51 g51Var = (g51) this.A.remove(str);
        if (str.equals(this.z) && this.A.size() > 0) {
            Iterator it = this.A.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.z = (String) entry.getKey();
            if (this.E != null) {
                g51 g51Var2 = (g51) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.E;
                systemForegroundService.x.post(new cz4(systemForegroundService, g51Var2.a, g51Var2.c, g51Var2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.E;
                systemForegroundService2.x.post(new ez4(systemForegroundService2, g51Var2.a));
            }
        }
        InterfaceC0035QnHx interfaceC0035QnHx = this.E;
        if (g51Var == null || interfaceC0035QnHx == null) {
            return;
        }
        s52.c().a(F, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(g51Var.a), str, Integer.valueOf(g51Var.b)), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0035QnHx;
        systemForegroundService3.x.post(new ez4(systemForegroundService3, g51Var.a));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s52.c().a(F, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.E == null) {
            return;
        }
        g51 g51Var = new g51(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.A;
        linkedHashMap.put(stringExtra, g51Var);
        if (TextUtils.isEmpty(this.z)) {
            this.z = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.E;
            systemForegroundService.x.post(new cz4(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.E;
        systemForegroundService2.x.post(new dz4(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((g51) ((Map.Entry) it.next()).getValue()).b;
        }
        g51 g51Var2 = (g51) linkedHashMap.get(this.z);
        if (g51Var2 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.E;
            systemForegroundService3.x.post(new cz4(systemForegroundService3, g51Var2.a, g51Var2.c, i));
        }
    }

    @Override // defpackage.bn5
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            s52.c().a(F, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            nn5 nn5Var = this.w;
            ((on5) nn5Var.z).a(new yt4(nn5Var, str, true));
        }
    }

    @Override // defpackage.bn5
    public final void f(List<String> list) {
    }
}
