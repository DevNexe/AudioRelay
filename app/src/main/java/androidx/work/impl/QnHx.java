package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import defpackage.lg2;
import defpackage.r61;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx {
    public static final C0033QnHx a = new C0033QnHx();
    public static final CQf b = new CQf();
    public static final F1 c = new F1();
    public static final LPt8Fixed d = new LPt8Fixed();
    public static final NUlFixed e = new NUlFixed();
    public static final YKK f = new YKK();
    public static final auxFixed g = new auxFixed();

    public class CQf extends lg2 {
        public CQf() {
            super(3, 4);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            if (Build.VERSION.SDK_INT >= 23) {
                r61Var.e("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    public class F1 extends lg2 {
        public F1() {
            super(4, 5);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            r61Var.e("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class LPt8Fixed extends lg2 {
        public LPt8Fixed() {
            super(6, 7);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class NUlFixed extends lg2 {
        public NUlFixed() {
            super(7, 8);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.QnHx$QnHx, reason: collision with other inner class name */
    public class C0033QnHx extends lg2 {
        public C0033QnHx() {
            super(1, 2);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            r61Var.e("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            r61Var.e("DROP TABLE IF EXISTS alarmInfo");
            r61Var.e("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public static class T23 extends lg2 {
        public final Context c;

        public T23(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            if (this.b >= 10) {
                r61Var.w.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public class YKK extends lg2 {
        public YKK() {
            super(8, 9);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class auxFixed extends lg2 {
        public auxFixed() {
            super(11, 12);
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class byN extends lg2 {
        public final Context c;

        public byN(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // defpackage.lg2
        public final void a(r61 r61Var) {
            r61Var.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            boolean zContains = sharedPreferences.contains("reschedule_needed");
            SQLiteDatabase sQLiteDatabase = r61Var.w;
            if (zContains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                r61Var.b();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                    sharedPreferences.edit().clear().apply();
                    r61Var.h();
                    r61Var.c();
                } catch (Throwable th) {
                    r61Var.c();
                    throw th;
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                r61Var.b();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    r61Var.h();
                } finally {
                    r61Var.c();
                }
            }
        }
    }
}
