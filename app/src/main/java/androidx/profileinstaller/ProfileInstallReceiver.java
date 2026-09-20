package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import defpackage.hk0;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class QnHx implements CQf.F1 {
        public QnHx() {
        }

        @Override // androidx.profileinstaller.CQf.F1
        public final void a(int i, Object obj) {
            CQf.b.a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            CQf.b(context, new Executor() { // from class: ue3
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new QnHx(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string)) {
                if ("DELETE_SKIP_FILE".equals(string)) {
                    QnHx qnHx = new QnHx();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    qnHx.a(11, null);
                    return;
                }
                return;
            }
            QnHx qnHx2 = new QnHx();
            try {
                CQf.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                new hk0(10, 1, qnHx2, null).run();
            } catch (PackageManager.NameNotFoundException e) {
                new hk0(7, 1, qnHx2, e).run();
            }
        }
    }
}
