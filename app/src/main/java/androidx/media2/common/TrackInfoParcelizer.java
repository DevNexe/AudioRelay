package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class TrackInfoParcelizer {
    public static SessionPlayer$TrackInfo read(VersionedParcel versionedParcel) {
        SessionPlayer$TrackInfo sessionPlayer$TrackInfo = new SessionPlayer$TrackInfo();
        sessionPlayer$TrackInfo.a = versionedParcel.o(sessionPlayer$TrackInfo.a, 1);
        sessionPlayer$TrackInfo.b = versionedParcel.o(sessionPlayer$TrackInfo.b, 3);
        Bundle bundleH = versionedParcel.h(4, sessionPlayer$TrackInfo.e);
        sessionPlayer$TrackInfo.e = bundleH;
        if (bundleH != null && !bundleH.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")) {
            MediaFormat mediaFormat = new MediaFormat();
            sessionPlayer$TrackInfo.c = mediaFormat;
            Bundle bundle = sessionPlayer$TrackInfo.e;
            if (bundle.containsKey("language")) {
                mediaFormat.setString("language", bundle.getString("language"));
            }
            MediaFormat mediaFormat2 = sessionPlayer$TrackInfo.c;
            Bundle bundle2 = sessionPlayer$TrackInfo.e;
            if (bundle2.containsKey("mime")) {
                mediaFormat2.setString("mime", bundle2.getString("mime"));
            }
            MediaFormat mediaFormat3 = sessionPlayer$TrackInfo.c;
            Bundle bundle3 = sessionPlayer$TrackInfo.e;
            if (bundle3.containsKey("is-forced-subtitle")) {
                mediaFormat3.setInteger("is-forced-subtitle", bundle3.getInt("is-forced-subtitle"));
            }
            MediaFormat mediaFormat4 = sessionPlayer$TrackInfo.c;
            Bundle bundle4 = sessionPlayer$TrackInfo.e;
            if (bundle4.containsKey("is-autoselect")) {
                mediaFormat4.setInteger("is-autoselect", bundle4.getInt("is-autoselect"));
            }
            MediaFormat mediaFormat5 = sessionPlayer$TrackInfo.c;
            Bundle bundle5 = sessionPlayer$TrackInfo.e;
            if (bundle5.containsKey("is-default")) {
                mediaFormat5.setInteger("is-default", bundle5.getInt("is-default"));
            }
        }
        Bundle bundle6 = sessionPlayer$TrackInfo.e;
        if (bundle6 == null || !bundle6.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")) {
            sessionPlayer$TrackInfo.d = sessionPlayer$TrackInfo.b != 1;
        } else {
            sessionPlayer$TrackInfo.d = sessionPlayer$TrackInfo.e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
        }
        return sessionPlayer$TrackInfo;
    }

    public static void write(SessionPlayer$TrackInfo sessionPlayer$TrackInfo, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        synchronized (sessionPlayer$TrackInfo.f) {
            try {
                Bundle bundle = new Bundle();
                sessionPlayer$TrackInfo.e = bundle;
                bundle.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", sessionPlayer$TrackInfo.c == null);
                MediaFormat mediaFormat = sessionPlayer$TrackInfo.c;
                if (mediaFormat != null) {
                    Bundle bundle2 = sessionPlayer$TrackInfo.e;
                    if (mediaFormat.containsKey("language")) {
                        bundle2.putString("language", mediaFormat.getString("language"));
                    }
                    MediaFormat mediaFormat2 = sessionPlayer$TrackInfo.c;
                    Bundle bundle3 = sessionPlayer$TrackInfo.e;
                    if (mediaFormat2.containsKey("mime")) {
                        bundle3.putString("mime", mediaFormat2.getString("mime"));
                    }
                    MediaFormat mediaFormat3 = sessionPlayer$TrackInfo.c;
                    Bundle bundle4 = sessionPlayer$TrackInfo.e;
                    if (mediaFormat3.containsKey("is-forced-subtitle")) {
                        bundle4.putInt("is-forced-subtitle", mediaFormat3.getInteger("is-forced-subtitle"));
                    }
                    MediaFormat mediaFormat4 = sessionPlayer$TrackInfo.c;
                    Bundle bundle5 = sessionPlayer$TrackInfo.e;
                    if (mediaFormat4.containsKey("is-autoselect")) {
                        bundle5.putInt("is-autoselect", mediaFormat4.getInteger("is-autoselect"));
                    }
                    MediaFormat mediaFormat5 = sessionPlayer$TrackInfo.c;
                    Bundle bundle6 = sessionPlayer$TrackInfo.e;
                    if (mediaFormat5.containsKey("is-default")) {
                        bundle6.putInt("is-default", mediaFormat5.getInteger("is-default"));
                    }
                }
                sessionPlayer$TrackInfo.e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", sessionPlayer$TrackInfo.d);
            } catch (Throwable th) {
                throw th;
            }
        }
        versionedParcel.I(sessionPlayer$TrackInfo.a, 1);
        versionedParcel.I(sessionPlayer$TrackInfo.b, 3);
        versionedParcel.B(4, sessionPlayer$TrackInfo.e);
    }
}
