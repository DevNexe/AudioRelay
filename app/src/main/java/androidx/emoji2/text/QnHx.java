package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import defpackage.C0239D;
import defpackage.o41;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx {

    public static class CQf extends C0024QnHx {
    }

    public static class F1 extends CQf {
        @Override // androidx.emoji2.text.QnHx.C0024QnHx
        public final Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.QnHx$QnHx, reason: collision with other inner class name */
    public static class C0024QnHx {
        public Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    public static auxFixed a(Context context) {
        ProviderInfo providerInfo;
        o41 o41Var;
        boolean z;
        ApplicationInfo applicationInfo;
        C0024QnHx f1 = Build.VERSION.SDK_INT >= 28 ? new F1() : new CQf();
        PackageManager packageManager = context.getPackageManager();
        C0239D.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null) {
                z = false;
            } else {
                z = true;
                if ((applicationInfo.flags & 1) != 1) {
                    z = false;
                }
            }
        } while (!z);
        if (providerInfo == null) {
            o41Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrA = f1.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrA) {
                    arrayList.add(signature.toByteArray());
                }
                o41Var = new o41(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                o41Var = null;
            }
        }
        if (o41Var == null) {
            return null;
        }
        return new auxFixed(context, o41Var);
    }
}
