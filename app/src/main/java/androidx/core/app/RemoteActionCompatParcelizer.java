package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) versionedParcel.x(remoteActionCompat.a, 1);
        CharSequence charSequenceJ = remoteActionCompat.b;
        if (versionedParcel.l(2)) {
            charSequenceJ = versionedParcel.j();
        }
        remoteActionCompat.b = charSequenceJ;
        CharSequence charSequenceJ2 = remoteActionCompat.c;
        if (versionedParcel.l(3)) {
            charSequenceJ2 = versionedParcel.j();
        }
        remoteActionCompat.c = charSequenceJ2;
        remoteActionCompat.d = (PendingIntent) versionedParcel.s(remoteActionCompat.d, 4);
        remoteActionCompat.e = versionedParcel.f(5, remoteActionCompat.e);
        remoteActionCompat.f = versionedParcel.f(6, remoteActionCompat.f);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.R(remoteActionCompat.a, 1);
        CharSequence charSequence = remoteActionCompat.b;
        versionedParcel.y(2);
        versionedParcel.E(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        versionedParcel.y(3);
        versionedParcel.E(charSequence2);
        versionedParcel.M(remoteActionCompat.d, 4);
        versionedParcel.z(5, remoteActionCompat.e);
        versionedParcel.z(6, remoteActionCompat.f);
    }
}
