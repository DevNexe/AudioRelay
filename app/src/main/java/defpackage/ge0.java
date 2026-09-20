package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge0 implements ServiceConnection {
    public Context a;

    public class QnHx extends androidx.browser.customtabs.QnHx {
        public QnHx(ICustomTabsService iCustomTabsService, ComponentName componentName) {
            super(iCustomTabsService, componentName);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.QnHx qnHx);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new QnHx(ICustomTabsService.Stub.K0(iBinder), componentName));
    }
}
