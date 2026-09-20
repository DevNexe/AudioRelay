package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eq2 {
    public final Notification.Builder a;
    public final xp2 b;
    public final Bundle c;

    public eq2(xp2 xp2Var) {
        String str;
        Bundle[] bundleArr;
        int i;
        ArrayList<String> arrayList;
        int i2;
        new ArrayList();
        this.c = new Bundle();
        this.b = xp2Var;
        Context context = xp2Var.a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(context, xp2Var.q);
        } else {
            this.a = new Notification.Builder(context);
        }
        Notification notification = xp2Var.s;
        Resources resources = null;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(xp2Var.e).setContentText(xp2Var.f).setContentInfo(null).setContentIntent(xp2Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        this.a.setSubText(null).setUsesChronometer(false).setPriority(xp2Var.h);
        for (up2 up2Var : xp2Var.b) {
            int i3 = Build.VERSION.SDK_INT;
            if (up2Var.b == null && (i2 = up2Var.h) != 0) {
                up2Var.b = IconCompat.b(null, "", i2);
            }
            IconCompat iconCompat = up2Var.b;
            PendingIntent pendingIntent = up2Var.j;
            CharSequence charSequence = up2Var.i;
            Notification.Action.Builder builder = i3 >= 23 ? new Notification.Action.Builder(iconCompat != null ? iconCompat.g(null) : null, charSequence, pendingIntent) : new Notification.Action.Builder(iconCompat != null ? iconCompat.c() : 0, charSequence, pendingIntent);
            ko3[] ko3VarArr = up2Var.c;
            if (ko3VarArr != null) {
                int length = ko3VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (ko3VarArr.length > 0) {
                    ko3 ko3Var = ko3VarArr[0];
                    throw null;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    builder.addRemoteInput(remoteInputArr[i4]);
                }
            }
            Bundle bundle = up2Var.a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z = up2Var.d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                builder.setAllowGeneratedReplies(z);
            }
            int i6 = up2Var.f;
            bundle2.putInt("android.support.action.semanticAction", i6);
            if (i5 >= 28) {
                builder.setSemanticAction(i6);
            }
            if (i5 >= 29) {
                builder.setContextual(up2Var.g);
            }
            if (i5 >= 31) {
                builder.setAuthenticationRequired(up2Var.k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", up2Var.e);
            builder.addExtras(bundle2);
            this.a.addAction(builder.build());
        }
        Bundle bundle3 = xp2Var.n;
        if (bundle3 != null) {
            this.c.putAll(bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.a.setShowWhen(xp2Var.i);
        this.a.setLocalOnly(xp2Var.k).setGroup(null).setGroupSummary(false).setSortKey(null);
        this.a.setCategory(null).setColor(xp2Var.o).setVisibility(xp2Var.p).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
        ArrayList<d23> arrayList2 = xp2Var.c;
        ArrayList<String> arrayList3 = xp2Var.t;
        if (i7 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList2.size());
                for (d23 d23Var : arrayList2) {
                    String str2 = d23Var.c;
                    if (str2 == null) {
                        CharSequence charSequence2 = d23Var.a;
                        str2 = charSequence2 != null ? "name:" + ((Object) charSequence2) : "";
                    }
                    arrayList.add(str2);
                }
            }
            if (arrayList != null) {
                if (arrayList3 != null) {
                    Q6g q6g = new Q6g(arrayList3.size() + arrayList.size());
                    q6g.addAll(arrayList);
                    q6g.addAll(arrayList3);
                    arrayList = new ArrayList<>(q6g);
                }
                arrayList3 = arrayList;
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator<String> it = arrayList3.iterator();
            while (it.hasNext()) {
                this.a.addPerson(it.next());
            }
        }
        ArrayList<up2> arrayList4 = xp2Var.d;
        if (arrayList4.size() > 0) {
            if (xp2Var.n == null) {
                xp2Var.n = new Bundle();
            }
            Bundle bundle4 = xp2Var.n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList4.size()) {
                String string = Integer.toString(i8);
                up2 up2Var2 = arrayList4.get(i8);
                Object obj = fq2.a;
                Bundle bundle7 = new Bundle();
                if (up2Var2.b == null && (i = up2Var2.h) != 0) {
                    up2Var2.b = IconCompat.b(resources, "", i);
                }
                IconCompat iconCompat2 = up2Var2.b;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle7.putCharSequence("title", up2Var2.i);
                bundle7.putParcelable("actionIntent", up2Var2.j);
                Bundle bundle8 = up2Var2.a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", up2Var2.d);
                bundle7.putBundle("extras", bundle9);
                ko3[] ko3VarArr2 = up2Var2.c;
                if (ko3VarArr2 == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[ko3VarArr2.length];
                    if (ko3VarArr2.length > 0) {
                        ko3 ko3Var2 = ko3VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                    bundleArr = bundleArr2;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", up2Var2.e);
                bundle7.putInt("semanticAction", up2Var2.f);
                bundle6.putBundle(string, bundle7);
                i8++;
                resources = null;
                arrayList4 = arrayList4;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (xp2Var.n == null) {
                xp2Var.n = new Bundle();
            }
            xp2Var.n.putBundle("android.car.EXTENSIONS", bundle4);
            this.c.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            str = null;
            this.a.setExtras(xp2Var.n).setRemoteInputHistory(null);
        } else {
            str = null;
        }
        if (i9 >= 26) {
            this.a.setBadgeIconType(0).setSettingsText(str).setShortcutId(str).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (xp2Var.m) {
                this.a.setColorized(xp2Var.l);
            }
            if (!TextUtils.isEmpty(xp2Var.q)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            for (d23 d23Var2 : arrayList2) {
                Notification.Builder builder2 = this.a;
                d23Var2.getClass();
                builder2.addPerson(d23.QnHx.b(d23Var2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(xp2Var.r);
            this.a.setBubbleMetadata(null);
        }
    }
}
