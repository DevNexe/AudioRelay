package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfz extends zzep {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public zzfz() {
        this(AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws zzfy {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.l;
        DatagramPacket datagramPacket = this.f;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.l = length;
                zzg(length);
            } catch (SocketTimeoutException e) {
                throw new zzfy(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new zzfy(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.l;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.e, length2 - i4, bArr, i, iMin);
        this.l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzfy {
        Uri uri = zzfaVar.zza;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        b(zzfaVar);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            c(zzfaVar);
            return -1L;
        } catch (IOException e) {
            throw new zzfy(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new zzfy(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            a();
        }
    }

    public zzfz(int i) {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }
}
