package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ String[] w;
    public final /* synthetic */ Activity x;
    public final /* synthetic */ int y;

    public g(ComponentActivity componentActivity, String[] strArr, int i) {
        this.w = strArr;
        this.x = componentActivity;
        this.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.w;
        int[] iArr = new int[strArr.length];
        Activity activity = this.x;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((q2H0.F1) activity).onRequestPermissionsResult(this.y, strArr, iArr);
    }
}
