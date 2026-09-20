package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public final class he0 {
    public final ICustomTabsService a;
    public final ICustomTabsCallback b;
    public final ComponentName c;
    public final PendingIntent d = null;

    public he0(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.a = iCustomTabsService;
        this.b = iCustomTabsCallback;
        this.c = componentName;
    }
}
