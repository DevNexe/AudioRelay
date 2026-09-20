package androidx.work.impl.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import defpackage.AY;
import defpackage.O;
import defpackage.a42;
import defpackage.at3;
import defpackage.bo5;
import defpackage.co2;
import defpackage.ct3;
import defpackage.h70;
import defpackage.kn5;
import defpackage.nt0;
import defpackage.o5;
import defpackage.p80;
import defpackage.qj4;
import defpackage.r61;
import defpackage.v61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class CQf implements androidx.work.impl.model.QnHx {
    public final at3 a;
    public final QnHx b;
    public final C0036CQf c;
    public final F1 d;
    public final LPt8Fixed e;
    public final NUlFixed f;
    public final YKK g;
    public final auxFixed h;
    public final T23 i;

    /* JADX INFO: renamed from: androidx.work.impl.model.CQf$CQf, reason: collision with other inner class name */
    public class C0036CQf extends qj4 {
        public C0036CQf(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class F1 extends qj4 {
        public F1(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class LPt8Fixed extends qj4 {
        public LPt8Fixed(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class NUlFixed extends qj4 {
        public NUlFixed(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class QnHx extends nt0<WorkSpec> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, WorkSpec workSpec) throws Throwable {
            int i;
            int i2;
            Throwable th;
            ObjectOutputStream objectOutputStream;
            WorkSpec workSpec2 = workSpec;
            String str = workSpec2.a;
            int i3 = 1;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            v61Var.e(2, bo5.f(workSpec2.b));
            String str2 = workSpec2.c;
            if (str2 == null) {
                v61Var.f(3);
            } else {
                v61Var.g(3, str2);
            }
            String str3 = workSpec2.d;
            if (str3 == null) {
                v61Var.f(4);
            } else {
                v61Var.g(4, str3);
            }
            byte[] bArrB = androidx.work.CQf.b(workSpec2.e);
            if (bArrB == null) {
                v61Var.f(5);
            } else {
                v61Var.b(5, bArrB);
            }
            byte[] bArrB2 = androidx.work.CQf.b(workSpec2.f);
            if (bArrB2 == null) {
                v61Var.f(6);
            } else {
                v61Var.b(6, bArrB2);
            }
            v61Var.e(7, workSpec2.g);
            v61Var.e(8, workSpec2.h);
            v61Var.e(9, workSpec2.i);
            v61Var.e(10, workSpec2.k);
            int i4 = workSpec2.l;
            int iH = O.h(i4);
            if (iH == 0) {
                i = 0;
            } else {
                if (iH != 1) {
                    throw new IllegalArgumentException("Could not convert " + o5.e(i4) + " to int");
                }
                i = 1;
            }
            v61Var.e(11, i);
            v61Var.e(12, workSpec2.m);
            v61Var.e(13, workSpec2.n);
            v61Var.e(14, workSpec2.o);
            v61Var.e(15, workSpec2.p);
            v61Var.e(16, workSpec2.q ? 1L : 0L);
            int i5 = workSpec2.r;
            int iH2 = O.h(i5);
            if (iH2 == 0) {
                i2 = 0;
            } else {
                if (iH2 != 1) {
                    throw new IllegalArgumentException("Could not convert " + a42.b(i5) + " to int");
                }
                i2 = 1;
            }
            v61Var.e(17, i2);
            h70 h70Var = workSpec2.j;
            if (h70Var == null) {
                v61Var.f(18);
                v61Var.f(19);
                v61Var.f(20);
                v61Var.f(21);
                v61Var.f(22);
                v61Var.f(23);
                v61Var.f(24);
                v61Var.f(25);
                return;
            }
            co2 co2Var = h70Var.a;
            int iOrdinal = co2Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 0;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i3 = 2;
                } else if (iOrdinal == 3) {
                    i3 = 3;
                } else if (iOrdinal == 4) {
                    i3 = 4;
                } else {
                    if (Build.VERSION.SDK_INT < 30 || co2Var != co2.TEMPORARILY_UNMETERED) {
                        throw new IllegalArgumentException("Could not convert " + co2Var + " to int");
                    }
                    i3 = 5;
                }
            }
            v61Var.e(18, i3);
            v61Var.e(19, h70Var.b ? 1L : 0L);
            v61Var.e(20, h70Var.c ? 1L : 0L);
            v61Var.e(21, h70Var.d ? 1L : 0L);
            v61Var.e(22, h70Var.e ? 1L : 0L);
            v61Var.e(23, h70Var.f);
            v61Var.e(24, h70Var.g);
            p80 p80Var = h70Var.h;
            byte[] byteArray = null;
            objectOutputStream = null;
            ObjectOutputStream objectOutputStream2 = null;
            if (p80Var.a.size() != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        HashSet<p80.QnHx> hashSet = p80Var.a;
                        try {
                            objectOutputStream.writeInt(hashSet.size());
                            for (p80.QnHx qnHx : hashSet) {
                                objectOutputStream.writeUTF(qnHx.a.toString());
                                objectOutputStream.writeBoolean(qnHx.b);
                            }
                            try {
                                objectOutputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } catch (IOException e2) {
                            e = e2;
                            objectOutputStream2 = objectOutputStream;
                            e.printStackTrace();
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                    }
                } catch (IOException e6) {
                    e = e6;
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (byteArray == null) {
                v61Var.f(25);
            } else {
                v61Var.b(25, byteArray);
            }
        }
    }

    public class T23 extends qj4 {
        public T23(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class YKK extends qj4 {
        public YKK(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class auxFixed extends qj4 {
        public auxFixed(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public CQf(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
        this.c = new C0036CQf(at3Var);
        this.d = new F1(at3Var);
        this.e = new LPt8Fixed(at3Var);
        this.f = new NUlFixed(at3Var);
        this.g = new YKK(at3Var);
        this.h = new auxFixed(at3Var);
        this.i = new T23(at3Var);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        at3 at3Var = this.a;
        at3Var.b();
        C0036CQf c0036CQf = this.c;
        v61 v61VarA = c0036CQf.a();
        if (str == null) {
            v61VarA.f(1);
        } else {
            v61VarA.g(1, str);
        }
        at3Var.c();
        try {
            v61VarA.h();
            at3Var.h();
        } finally {
            at3Var.f();
            c0036CQf.c(v61VarA);
        }
    }

    public final ArrayList b() throws Throwable {
        ct3 ct3Var;
        ct3 ct3VarE = ct3.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        ct3VarE.f(1, RCHTTPStatusCodes.SUCCESS);
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iY9);
                    int i2 = iY9;
                    String string2 = cursorG.getString(iY11);
                    int i3 = iY11;
                    h70 h70Var = new h70();
                    int i4 = iY;
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    int i5 = iY2;
                    int i6 = iY3;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    int i7 = i;
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(i7));
                    int i8 = iY13;
                    int i9 = iY15;
                    workSpec.g = cursorG.getLong(i9);
                    int i10 = iY4;
                    int i11 = iY16;
                    workSpec.h = cursorG.getLong(i11);
                    int i12 = iY17;
                    workSpec.i = cursorG.getLong(i12);
                    int i13 = iY18;
                    workSpec.k = cursorG.getInt(i13);
                    int i14 = iY19;
                    workSpec.l = bo5.b(cursorG.getInt(i14));
                    int i15 = iY20;
                    workSpec.m = cursorG.getLong(i15);
                    int i16 = iY21;
                    workSpec.n = cursorG.getLong(i16);
                    int i17 = iY22;
                    workSpec.o = cursorG.getLong(i17);
                    int i18 = iY23;
                    workSpec.p = cursorG.getLong(i18);
                    int i19 = iY24;
                    workSpec.q = cursorG.getInt(i19) != 0;
                    int i20 = iY25;
                    workSpec.r = bo5.d(cursorG.getInt(i20));
                    workSpec.j = h70Var;
                    arrayList.add(workSpec);
                    i = i7;
                    iY2 = i5;
                    iY15 = i9;
                    iY16 = i11;
                    iY20 = i15;
                    iY21 = i16;
                    iY24 = i19;
                    iY11 = i3;
                    iY = i4;
                    iY25 = i20;
                    iY23 = i18;
                    iY13 = i8;
                    iY9 = i2;
                    iY3 = i6;
                    iY22 = i17;
                    iY4 = i10;
                    iY17 = i12;
                    iY18 = i13;
                    iY19 = i14;
                }
                cursorG.close();
                ct3Var.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }

    public final ArrayList c(int i) throws Throwable {
        ct3 ct3Var;
        ct3 ct3VarE = ct3.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        ct3VarE.f(1, i);
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                int i2 = iY14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iY9);
                    int i3 = iY9;
                    String string2 = cursorG.getString(iY11);
                    int i4 = iY11;
                    h70 h70Var = new h70();
                    int i5 = iY;
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    int i6 = iY2;
                    int i7 = iY3;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    int i8 = i2;
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(i8));
                    int i9 = iY15;
                    int i10 = iY13;
                    workSpec.g = cursorG.getLong(i9);
                    int i11 = iY4;
                    int i12 = iY16;
                    workSpec.h = cursorG.getLong(i12);
                    int i13 = iY17;
                    workSpec.i = cursorG.getLong(i13);
                    int i14 = iY18;
                    workSpec.k = cursorG.getInt(i14);
                    int i15 = iY19;
                    workSpec.l = bo5.b(cursorG.getInt(i15));
                    int i16 = iY20;
                    workSpec.m = cursorG.getLong(i16);
                    int i17 = iY21;
                    workSpec.n = cursorG.getLong(i17);
                    int i18 = iY22;
                    workSpec.o = cursorG.getLong(i18);
                    int i19 = iY23;
                    workSpec.p = cursorG.getLong(i19);
                    int i20 = iY24;
                    workSpec.q = cursorG.getInt(i20) != 0;
                    int i21 = iY25;
                    workSpec.r = bo5.d(cursorG.getInt(i21));
                    workSpec.j = h70Var;
                    arrayList.add(workSpec);
                    i2 = i8;
                    iY2 = i6;
                    iY24 = i20;
                    iY9 = i3;
                    iY11 = i4;
                    iY = i5;
                    iY25 = i21;
                    iY13 = i10;
                    iY15 = i9;
                    iY16 = i12;
                    iY20 = i16;
                    iY21 = i17;
                    iY23 = i19;
                    iY3 = i7;
                    iY22 = i18;
                    iY4 = i11;
                    iY17 = i13;
                    iY18 = i14;
                    iY19 = i15;
                }
                cursorG.close();
                ct3Var.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }

    public final ArrayList d() throws Throwable {
        ct3 ct3Var;
        ct3 ct3VarE = ct3.e(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iY9);
                    int i2 = iY9;
                    String string2 = cursorG.getString(iY11);
                    int i3 = iY11;
                    h70 h70Var = new h70();
                    int i4 = iY;
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    int i5 = iY2;
                    int i6 = iY3;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    int i7 = i;
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(i7));
                    int i8 = iY13;
                    int i9 = iY15;
                    workSpec.g = cursorG.getLong(i9);
                    int i10 = iY4;
                    int i11 = iY16;
                    workSpec.h = cursorG.getLong(i11);
                    int i12 = iY17;
                    workSpec.i = cursorG.getLong(i12);
                    int i13 = iY18;
                    workSpec.k = cursorG.getInt(i13);
                    int i14 = iY19;
                    workSpec.l = bo5.b(cursorG.getInt(i14));
                    int i15 = iY20;
                    workSpec.m = cursorG.getLong(i15);
                    int i16 = iY21;
                    workSpec.n = cursorG.getLong(i16);
                    int i17 = iY22;
                    workSpec.o = cursorG.getLong(i17);
                    int i18 = iY23;
                    workSpec.p = cursorG.getLong(i18);
                    int i19 = iY24;
                    workSpec.q = cursorG.getInt(i19) != 0;
                    int i20 = iY25;
                    workSpec.r = bo5.d(cursorG.getInt(i20));
                    workSpec.j = h70Var;
                    arrayList.add(workSpec);
                    i = i7;
                    iY2 = i5;
                    iY15 = i9;
                    iY16 = i11;
                    iY20 = i15;
                    iY21 = i16;
                    iY24 = i19;
                    iY11 = i3;
                    iY = i4;
                    iY25 = i20;
                    iY23 = i18;
                    iY13 = i8;
                    iY9 = i2;
                    iY3 = i6;
                    iY22 = i17;
                    iY4 = i10;
                    iY17 = i12;
                    iY18 = i13;
                    iY19 = i14;
                }
                cursorG.close();
                ct3Var.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }

    public final ArrayList e() {
        ct3 ct3Var;
        ct3 ct3VarE = ct3.e(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iY9);
                    int i2 = iY9;
                    String string2 = cursorG.getString(iY11);
                    int i3 = iY11;
                    h70 h70Var = new h70();
                    int i4 = iY;
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    int i5 = iY2;
                    int i6 = iY3;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    int i7 = i;
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(i7));
                    int i8 = iY13;
                    int i9 = iY15;
                    workSpec.g = cursorG.getLong(i9);
                    int i10 = iY4;
                    int i11 = iY16;
                    workSpec.h = cursorG.getLong(i11);
                    int i12 = iY17;
                    workSpec.i = cursorG.getLong(i12);
                    int i13 = iY18;
                    workSpec.k = cursorG.getInt(i13);
                    int i14 = iY19;
                    workSpec.l = bo5.b(cursorG.getInt(i14));
                    int i15 = iY20;
                    workSpec.m = cursorG.getLong(i15);
                    int i16 = iY21;
                    workSpec.n = cursorG.getLong(i16);
                    int i17 = iY22;
                    workSpec.o = cursorG.getLong(i17);
                    int i18 = iY23;
                    workSpec.p = cursorG.getLong(i18);
                    int i19 = iY24;
                    workSpec.q = cursorG.getInt(i19) != 0;
                    int i20 = iY25;
                    workSpec.r = bo5.d(cursorG.getInt(i20));
                    workSpec.j = h70Var;
                    arrayList.add(workSpec);
                    i = i7;
                    iY2 = i5;
                    iY15 = i9;
                    iY16 = i11;
                    iY20 = i15;
                    iY21 = i16;
                    iY24 = i19;
                    iY11 = i3;
                    iY = i4;
                    iY25 = i20;
                    iY23 = i18;
                    iY13 = i8;
                    iY9 = i2;
                    iY3 = i6;
                    iY22 = i17;
                    iY4 = i10;
                    iY17 = i12;
                    iY18 = i13;
                    iY19 = i14;
                }
                cursorG.close();
                ct3Var.i();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }

    public final kn5 f(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            return cursorG.moveToFirst() ? bo5.e(cursorG.getInt(0)) : null;
        } finally {
            cursorG.close();
            ct3VarE.i();
        }
    }

    public final ArrayList g(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ct3VarE.i();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ct3VarE.i();
            throw th;
        }
    }

    public final ArrayList h(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ct3VarE.i();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ct3VarE.i();
            throw th;
        }
    }

    public final WorkSpec i(String str) {
        ct3 ct3Var;
        WorkSpec workSpec;
        ct3 ct3VarE = ct3.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iY9);
                    String string2 = cursorG.getString(iY11);
                    h70 h70Var = new h70();
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(iY14));
                    workSpec.g = cursorG.getLong(iY15);
                    workSpec.h = cursorG.getLong(iY16);
                    workSpec.i = cursorG.getLong(iY17);
                    workSpec.k = cursorG.getInt(iY18);
                    workSpec.l = bo5.b(cursorG.getInt(iY19));
                    workSpec.m = cursorG.getLong(iY20);
                    workSpec.n = cursorG.getLong(iY21);
                    workSpec.o = cursorG.getLong(iY22);
                    workSpec.p = cursorG.getLong(iY23);
                    workSpec.q = cursorG.getInt(iY24) != 0;
                    workSpec.r = bo5.d(cursorG.getInt(iY25));
                    workSpec.j = h70Var;
                } else {
                    workSpec = null;
                }
                cursorG.close();
                ct3Var.i();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }

    public final ArrayList j(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY2 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                WorkSpec.QnHx qnHx = new WorkSpec.QnHx();
                qnHx.a = cursorG.getString(iY);
                qnHx.b = bo5.e(cursorG.getInt(iY2));
                arrayList.add(qnHx);
            }
            cursorG.close();
            ct3VarE.i();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ct3VarE.i();
            throw th;
        }
    }

    public final int k(String str, long j) {
        at3 at3Var = this.a;
        at3Var.b();
        auxFixed auxVar = this.h;
        v61 v61VarA = auxVar.a();
        v61VarA.e(1, j);
        if (str == null) {
            v61VarA.f(2);
        } else {
            v61VarA.g(2, str);
        }
        at3Var.c();
        try {
            int iH = v61VarA.h();
            at3Var.h();
            return iH;
        } finally {
            at3Var.f();
            auxVar.c(v61VarA);
        }
    }

    public final void l(String str, androidx.work.CQf cQf) throws Throwable {
        at3 at3Var = this.a;
        at3Var.b();
        F1 f1 = this.d;
        v61 v61VarA = f1.a();
        byte[] bArrB = androidx.work.CQf.b(cQf);
        if (bArrB == null) {
            v61VarA.f(1);
        } else {
            v61VarA.b(1, bArrB);
        }
        if (str == null) {
            v61VarA.f(2);
        } else {
            v61VarA.g(2, str);
        }
        at3Var.c();
        try {
            v61VarA.h();
            at3Var.h();
        } finally {
            at3Var.f();
            f1.c(v61VarA);
        }
    }

    public final void m(String str, long j) {
        at3 at3Var = this.a;
        at3Var.b();
        LPt8Fixed lPt8 = this.e;
        v61 v61VarA = lPt8.a();
        v61VarA.e(1, j);
        if (str == null) {
            v61VarA.f(2);
        } else {
            v61VarA.g(2, str);
        }
        at3Var.c();
        try {
            v61VarA.h();
            at3Var.h();
        } finally {
            at3Var.f();
            lPt8.c(v61VarA);
        }
    }

    public final int n(kn5 kn5Var, String... strArr) {
        at3 at3Var = this.a;
        at3Var.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        at3Var.a();
        at3Var.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((r61) at3Var.c.U()).w.compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, bo5.f(kn5Var));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i2);
            } else {
                sQLiteStatementCompileStatement.bindString(i2, str);
            }
            i2++;
        }
        at3Var.c();
        try {
            int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
            at3Var.h();
            return iExecuteUpdateDelete;
        } finally {
            at3Var.f();
        }
    }
}
