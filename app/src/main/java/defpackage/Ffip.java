package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class Ffip extends FLr<String, Boolean> {
    @Override // defpackage.FLr
    public final Intent a(Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
    }

    @Override // defpackage.FLr
    public final FLr.QnHx b(ComponentActivity componentActivity, Object obj) {
        if (r80.a(componentActivity, (String) obj) == 0) {
            return new FLr.QnHx(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.FLr
    public final Object c(Intent intent, int i) {
        boolean z;
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z2 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
