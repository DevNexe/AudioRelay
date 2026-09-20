package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaControllerCallback extends IInterface {

    public static abstract class Stub extends Binder implements IMediaControllerCallback {
        public static final /* synthetic */ int w = 0;

        public static class Proxy implements IMediaControllerCallback {
            public final IBinder w;

            public Proxy(IBinder iBinder) {
                this.w = iBinder;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void G0(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.w.transact(3, parcelObtain, null, 1)) {
                        int i = Stub.w;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void Y() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.w.transact(2, parcelObtain, null, 1)) {
                        int i = Stub.w;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void a0(MediaMetadataCompat mediaMetadataCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        parcelObtain.writeInt(1);
                        parcelObtain.writeBundle(mediaMetadataCompat.w);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.w.transact(4, parcelObtain, null, 1)) {
                        int i = Stub.w;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.w;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void g0(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i);
                    if (!this.w.transact(9, parcelObtain, null, 1)) {
                        int i2 = Stub.w;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    ((MediaControllerCompat$Callback.StubCompat) this).x.get();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    Y();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat$Callback.StubCompat) this).G0(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    a0(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    s0();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    v();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                    }
                    Q();
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    J0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat$Callback.StubCompat) this).g0(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat$Callback.StubCompat) this).x.get();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat$Callback.StubCompat) this).x.get();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat$Callback.StubCompat) this).x.get();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void G0(PlaybackStateCompat playbackStateCompat);

    void J0(ParcelableVolumeInfo parcelableVolumeInfo);

    void Q();

    void Y();

    void a0(MediaMetadataCompat mediaMetadataCompat);

    void g0(int i);

    void s0();

    void v();
}
