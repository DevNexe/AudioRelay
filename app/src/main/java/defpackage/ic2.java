package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.azefsw.audioconnect.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ic2 {
    public final Context a;
    public final MediaSessionCompat b;

    public ic2(Context context) {
        this.a = context;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context);
        mediaSessionCompat.a.a.setMediaButtonReceiver(null);
        mediaSessionCompat.c(a(context.getString(R.string.app_name)));
        MediaSessionCompat.MediaSessionImplApi21 mediaSessionImplApi21 = mediaSessionCompat.a;
        if (mediaSessionImplApi21.i != 0) {
            mediaSessionImplApi21.i = 0;
            synchronized (mediaSessionImplApi21.c) {
                int iBeginBroadcast = mediaSessionImplApi21.f.beginBroadcast();
                while (true) {
                    iBeginBroadcast--;
                    if (iBeginBroadcast < 0) {
                        break;
                    } else {
                        try {
                            ((IMediaControllerCallback) mediaSessionImplApi21.f.getBroadcastItem(iBeginBroadcast)).g0(0);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                mediaSessionImplApi21.f.finishBroadcast();
            }
        }
        mediaSessionCompat.d(new PlaybackStateCompat(0, 0L, 0L, 1.0f, 0L, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
        this.b = mediaSessionCompat;
    }

    public final MediaMetadataCompat a(String str) {
        Bundle bundle = new Bundle();
        Bt7j<String, Integer> bt7j = MediaMetadataCompat.y;
        if (bt7j.containsKey("android.media.metadata.DURATION") && bt7j.getOrDefault("android.media.metadata.DURATION", null).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        bundle.putLong("android.media.metadata.DURATION", -1L);
        if (bt7j.containsKey("android.media.metadata.TITLE") && bt7j.getOrDefault("android.media.metadata.TITLE", null).intValue() != 1) {
            throw new IllegalArgumentException("The android.media.metadata.TITLE key cannot be used to put a String");
        }
        bundle.putCharSequence("android.media.metadata.TITLE", str);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.a.getResources(), R.mipmap.ic_launcher_foreground);
        Bt7j<String, Integer> bt7j2 = MediaMetadataCompat.y;
        if (bt7j2.containsKey("android.media.metadata.ART") && bt7j2.getOrDefault("android.media.metadata.ART", null).intValue() != 2) {
            throw new IllegalArgumentException(fc2.a("The ", "android.media.metadata.ART", " key cannot be used to put a Bitmap"));
        }
        bundle.putParcelable("android.media.metadata.ART", bitmapDecodeResource);
        return new MediaMetadataCompat(bundle);
    }
}
