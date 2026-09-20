package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.work.QnHx;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ne3 {
    public static final String a = s52.e("ProcessUtils");

    public static boolean a(Context context, QnHx qnHx) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, ne3.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (!(objInvoke instanceof String)) {
                    int iMyPid = Process.myPid();
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                processName = null;
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == iMyPid) {
                                processName = next.processName;
                                break;
                            }
                        }
                    } else {
                        processName = null;
                        break;
                    }
                } else {
                    processName = (String) objInvoke;
                }
            } catch (Throwable th) {
                s52.c().a(a, "Unable to check ActivityThread for processName", th);
            }
        }
        qnHx.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
