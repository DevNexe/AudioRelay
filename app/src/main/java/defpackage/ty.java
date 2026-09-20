package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.emoji2.text.auxFixed;
import androidx.work.WorkManagerInitializer;
import androidx.work.impl.model.WorkSpec;
import com.azefsw.audioconnect.AudioConnectApp;
import com.revenuecat.purchases.google.BillingWrapper;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ty(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = this.w;
        int i2 = 5;
        boolean z = false;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                ((ComponentActivity) obj2).invalidateOptionsMenu();
                return;
            case 1:
                zy.a((zy) obj2);
                return;
            case 2:
                ((Toolbar) obj2).l();
                return;
            case 3:
                ((v85) obj2).a();
                return;
            case 4:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj2;
                androidComposeView.H0 = false;
                MotionEvent motionEvent = androidComposeView.B0;
                if (!(motionEvent.getActionMasked() == 10)) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                androidComposeView.F(motionEvent);
                return;
            case 5:
                Activity activity = (Activity) obj2;
                int i3 = q2H0.b;
                if (activity.isFinishing()) {
                    return;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    Class<?> cls = HR47.a;
                    boolean z2 = i4 == 26 || i4 == 27;
                    Method method = HR47.f;
                    if ((!z2 || method != null) && (HR47.e != null || HR47.d != null)) {
                        try {
                            Object obj3 = HR47.c.get(activity);
                            if (obj3 != null && (obj = HR47.b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                HR47.QnHx qnHx = new HR47.QnHx(activity);
                                application.registerActivityLifecycleCallbacks(qnHx);
                                Handler handler = HR47.g;
                                handler.post(new MGV(qnHx, obj3));
                                try {
                                    if (i4 == 26 || i4 == 27) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new azb(application, qnHx));
                                } catch (Throwable th) {
                                    handler.post(new azb(application, qnHx));
                                    throw th;
                                }
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (z) {
                        return;
                    }
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = HR47.a;
                activity.recreate();
                z = true;
                if (z) {
                    activity.recreate();
                    return;
                }
                return;
            case 6:
                ((auxFixed.CQf) obj2).c();
                return;
            case 7:
                AudioConnectApp.QnHx qnHx2 = ((AudioConnectApp) obj2).w;
                if (qnHx2 == null) {
                    ur1.e("deps");
                    throw null;
                }
                pf4 pf4Var = qnHx2.a;
                Context context = pf4Var.w;
                SharedPreferences sharedPreferences = context.getSharedPreferences("ar_local_prefs", 0);
                if (sharedPreferences.getBoolean("is_workmanager_cleaned_up", false)) {
                    a62.a.k("WorkManager's DB already cleaned up.");
                } else {
                    a62.a.k("Checking WorkManager's DB...");
                    Context context2 = pf4Var.w;
                    for (File file : ps0.M(context2.getDatabasePath("androidx.work.workdb"), new File(context2.getNoBackupFilesDir(), "androidx.work.workdb"))) {
                        try {
                            if (file.exists()) {
                                try {
                                    a62.a.l("WorkManager's DB exists, we're deleting it...");
                                    file.delete();
                                    z = true;
                                } catch (Throwable unused2) {
                                    z = true;
                                    a62.a.a("Failed to check or delete the WorkManager DB");
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                    if (!z) {
                        a62.a.k("WorkManager's DB doesn't exists, there's nothing to do...");
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("is_workmanager_cleaned_up", true);
                    if (!editorEdit.commit()) {
                        a62.a.a("Failed to commit is_workmanager_cleaned_up");
                    }
                    if (!ur1.a(nl3.a(WorkSpec.class).a(), "WorkSpec")) {
                        throw new IllegalStateException("The class WorkSpec shouldn't be renamed. Either our proguard's config changed or androidx.work changed something".toString());
                    }
                }
                Bt.c(context).d(WorkManagerInitializer.class);
                return;
            case 8:
                ln5 ln5Var = (ln5) obj2;
                ln5Var.getClass();
                ln5Var.d.e(new sn1(ln5Var, i2));
                return;
            case 9:
                BillingWrapper.m15onBillingServiceDisconnected$lambda26((BillingWrapper) obj2);
                return;
            default:
                am0 am0Var = (am0) ((jl3) obj2).w;
                if (am0Var != null) {
                    am0Var.a();
                    return;
                }
                return;
        }
    }
}
