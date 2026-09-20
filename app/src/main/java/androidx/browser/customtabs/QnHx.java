package androidx.browser.customtabs;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import defpackage.he0;

/* JADX INFO: loaded from: classes.dex */
public class QnHx {
    public final ICustomTabsService a;
    public final ComponentName b;

    public QnHx(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.a = iCustomTabsService;
        this.b = componentName;
    }

    public final he0 a() {
        ICustomTabsCallback.Stub stub = new ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient$2
            {
                new Handler(Looper.getMainLooper());
            }
        };
        ICustomTabsService iCustomTabsService = this.a;
        try {
            if (iCustomTabsService.f0(stub)) {
                return new he0(iCustomTabsService, stub, this.b);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }
}
