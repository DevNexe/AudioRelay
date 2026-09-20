package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.g24;
import defpackage.gh1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcay extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcay> CREATOR = new zzcaz();
    public ParcelFileDescriptor w;
    public Parcelable x = null;
    public boolean y = true;

    public zzcay(ParcelFileDescriptor parcelFileDescriptor) {
        this.w = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.w == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.x.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcax
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                Parcelable.Creator<zzcay> creator = zzcay.CREATOR;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            gh1.a(dataOutputStream2);
                                        } catch (IOException e) {
                                            e = e;
                                            dataOutputStream = dataOutputStream2;
                                            zzcgn.zzh("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                gh1.a(outputStream);
                                            } else {
                                                gh1.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                gh1.a(outputStream);
                                            } else {
                                                gh1.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e) {
                        e = e;
                        zzcgn.zzh("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "LargeParcelTeleporter.pipeData.2");
                        gh1.a(autoCloseOutputStream);
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                }
                this.w = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iP = Th.P(parcel, 20293);
        Th.I(parcel, 2, this.w, i);
        Th.X(parcel, iP);
    }

    public final g24 zza(Parcelable.Creator creator) {
        if (this.y) {
            if (this.w == null) {
                zzcgn.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.w));
            try {
                try {
                    int i = dataInputStream.readInt();
                    byte[] bArr = new byte[i];
                    dataInputStream.readFully(bArr, 0, i);
                    gh1.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i);
                        parcelObtain.setDataPosition(0);
                        this.x = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.y = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    zzcgn.zzh("Could not read from parcel file descriptor", e);
                    gh1.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                gh1.a(dataInputStream);
                throw th2;
            }
        }
        return (g24) this.x;
    }
}
