package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.model.CQf;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import defpackage.bt3;
import defpackage.cf0;
import defpackage.cs1;
import defpackage.dx4;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.k05;
import defpackage.mj0;
import defpackage.nj0;
import defpackage.pn5;
import defpackage.qn5;
import defpackage.r61;
import defpackage.rn5;
import defpackage.sa3;
import defpackage.sn5;
import defpackage.ta3;
import defpackage.yn5;
import defpackage.zn5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile CQf l;
    public volatile nj0 m;
    public volatile zn5 n;
    public volatile hz4 o;
    public volatile qn5 p;
    public volatile sn5 q;
    public volatile ta3 r;

    public class QnHx extends bt3.QnHx {
        public QnHx() {
        }

        @Override // bt3.QnHx
        public final void a(r61 r61Var) {
            r61Var.e("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            r61Var.e("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            r61Var.e("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            r61Var.e("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            r61Var.e("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            r61Var.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            r61Var.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // bt3.QnHx
        public final bt3.CQf b(r61 r61Var) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new k05.QnHx(1, "work_spec_id", "TEXT", null, true, 1));
            map.put("prerequisite_id", new k05.QnHx(2, "prerequisite_id", "TEXT", null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            hashSet.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new k05.LPt8Fixed(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
            hashSet2.add(new k05.LPt8Fixed(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
            k05 k05Var = new k05("Dependency", map, hashSet, hashSet2);
            k05 k05VarA = k05.a(r61Var, "Dependency");
            if (!k05Var.equals(k05VarA)) {
                return new bt3.CQf(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + k05Var + "\n Found:\n" + k05VarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put(FacebookAdapter.KEY_ID, new k05.QnHx(1, FacebookAdapter.KEY_ID, "TEXT", null, true, 1));
            map2.put(AdOperationMetric.INIT_STATE, new k05.QnHx(0, AdOperationMetric.INIT_STATE, "INTEGER", null, true, 1));
            map2.put("worker_class_name", new k05.QnHx(0, "worker_class_name", "TEXT", null, true, 1));
            map2.put("input_merger_class_name", new k05.QnHx(0, "input_merger_class_name", "TEXT", null, false, 1));
            map2.put("input", new k05.QnHx(0, "input", "BLOB", null, true, 1));
            map2.put("output", new k05.QnHx(0, "output", "BLOB", null, true, 1));
            map2.put("initial_delay", new k05.QnHx(0, "initial_delay", "INTEGER", null, true, 1));
            map2.put("interval_duration", new k05.QnHx(0, "interval_duration", "INTEGER", null, true, 1));
            map2.put("flex_duration", new k05.QnHx(0, "flex_duration", "INTEGER", null, true, 1));
            map2.put("run_attempt_count", new k05.QnHx(0, "run_attempt_count", "INTEGER", null, true, 1));
            map2.put("backoff_policy", new k05.QnHx(0, "backoff_policy", "INTEGER", null, true, 1));
            map2.put("backoff_delay_duration", new k05.QnHx(0, "backoff_delay_duration", "INTEGER", null, true, 1));
            map2.put("period_start_time", new k05.QnHx(0, "period_start_time", "INTEGER", null, true, 1));
            map2.put("minimum_retention_duration", new k05.QnHx(0, "minimum_retention_duration", "INTEGER", null, true, 1));
            map2.put("schedule_requested_at", new k05.QnHx(0, "schedule_requested_at", "INTEGER", null, true, 1));
            map2.put("run_in_foreground", new k05.QnHx(0, "run_in_foreground", "INTEGER", null, true, 1));
            map2.put("out_of_quota_policy", new k05.QnHx(0, "out_of_quota_policy", "INTEGER", null, true, 1));
            map2.put("required_network_type", new k05.QnHx(0, "required_network_type", "INTEGER", null, false, 1));
            map2.put("requires_charging", new k05.QnHx(0, "requires_charging", "INTEGER", null, true, 1));
            map2.put("requires_device_idle", new k05.QnHx(0, "requires_device_idle", "INTEGER", null, true, 1));
            map2.put("requires_battery_not_low", new k05.QnHx(0, "requires_battery_not_low", "INTEGER", null, true, 1));
            map2.put("requires_storage_not_low", new k05.QnHx(0, "requires_storage_not_low", "INTEGER", null, true, 1));
            map2.put("trigger_content_update_delay", new k05.QnHx(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
            map2.put("trigger_max_content_delay", new k05.QnHx(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
            map2.put("content_uri_triggers", new k05.QnHx(0, "content_uri_triggers", "BLOB", null, false, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new k05.LPt8Fixed(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
            hashSet4.add(new k05.LPt8Fixed(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
            k05 k05Var2 = new k05("WorkSpec", map2, hashSet3, hashSet4);
            k05 k05VarA2 = k05.a(r61Var, "WorkSpec");
            if (!k05Var2.equals(k05VarA2)) {
                return new bt3.CQf(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + k05Var2 + "\n Found:\n" + k05VarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new k05.QnHx(1, "tag", "TEXT", null, true, 1));
            map3.put("work_spec_id", new k05.QnHx(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new k05.LPt8Fixed(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
            k05 k05Var3 = new k05("WorkTag", map3, hashSet5, hashSet6);
            k05 k05VarA3 = k05.a(r61Var, "WorkTag");
            if (!k05Var3.equals(k05VarA3)) {
                return new bt3.CQf(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + k05Var3 + "\n Found:\n" + k05VarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new k05.QnHx(1, "work_spec_id", "TEXT", null, true, 1));
            map4.put("system_id", new k05.QnHx(0, "system_id", "INTEGER", null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            k05 k05Var4 = new k05("SystemIdInfo", map4, hashSet7, new HashSet(0));
            k05 k05VarA4 = k05.a(r61Var, "SystemIdInfo");
            if (!k05Var4.equals(k05VarA4)) {
                return new bt3.CQf(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + k05Var4 + "\n Found:\n" + k05VarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(MediationMetaData.KEY_NAME, new k05.QnHx(1, MediationMetaData.KEY_NAME, "TEXT", null, true, 1));
            map5.put("work_spec_id", new k05.QnHx(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new k05.LPt8Fixed(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
            k05 k05Var5 = new k05("WorkName", map5, hashSet8, hashSet9);
            k05 k05VarA5 = k05.a(r61Var, "WorkName");
            if (!k05Var5.equals(k05VarA5)) {
                return new bt3.CQf(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + k05Var5 + "\n Found:\n" + k05VarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new k05.QnHx(1, "work_spec_id", "TEXT", null, true, 1));
            map6.put("progress", new k05.QnHx(0, "progress", "BLOB", null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new k05.CQf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            k05 k05Var6 = new k05("WorkProgress", map6, hashSet10, new HashSet(0));
            k05 k05VarA6 = k05.a(r61Var, "WorkProgress");
            if (!k05Var6.equals(k05VarA6)) {
                return new bt3.CQf(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + k05Var6 + "\n Found:\n" + k05VarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(SubscriberAttributeKt.JSON_NAME_KEY, new k05.QnHx(1, SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", null, true, 1));
            map7.put("long_value", new k05.QnHx(0, "long_value", "INTEGER", null, false, 1));
            k05 k05Var7 = new k05("Preference", map7, new HashSet(0), new HashSet(0));
            k05 k05VarA7 = k05.a(r61Var, "Preference");
            if (k05Var7.equals(k05VarA7)) {
                return new bt3.CQf(true, null);
            }
            return new bt3.CQf(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + k05Var7 + "\n Found:\n" + k05VarA7);
        }
    }

    @Override // defpackage.at3
    public final cs1 d() {
        return new cs1(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.at3
    public final dx4 e(cf0 cf0Var) {
        bt3 bt3Var = new bt3(cf0Var, new QnHx());
        Context context = cf0Var.b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return cf0Var.a.a(new dx4.CQf(context, cf0Var.c, bt3Var, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final mj0 i() {
        nj0 nj0Var;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new nj0(this);
            }
            nj0Var = this.m;
        }
        return nj0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final sa3 j() {
        ta3 ta3Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new ta3(this);
            }
            ta3Var = this.r;
        }
        return ta3Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final gz4 k() {
        hz4 hz4Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new hz4(this);
            }
            hz4Var = this.o;
        }
        return hz4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pn5 l() {
        qn5 qn5Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new qn5(this);
            }
            qn5Var = this.p;
        }
        return qn5Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final rn5 m() {
        sn5 sn5Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new sn5(this);
            }
            sn5Var = this.q;
        }
        return sn5Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.QnHx n() {
        CQf cQf;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new CQf(this);
            }
            cQf = this.l;
        }
        return cQf;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final yn5 o() {
        zn5 zn5Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new zn5(this);
            }
            zn5Var = this.n;
        }
        return zn5Var;
    }
}
