package com.facebook.ads.internal.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0695Iz;
import com.facebook.ads.redexgen.X.ER;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GeobFrame extends Id3Frame {
    public static byte[] A04;
    public static String[] A05 = {"p5UgAckTjmiGwIEIp83kIoPYrYx51Hw3", "97Kf", "57iypjQefLkAX1Pf2WMG90QuGpxdZgI9", "MH86n39kjy3It9ArXMcOY1qRtEydqyVj", "czNdDpNwjYz3LUV8hemm9Bag6a1DUht2", "5z2r5SqfWorFCf0GfnerHo5X3AOsS9gQ", "7Yq0Z", "aSTQxqZrOCwJPjy2PBAUJaSPZ7cz8UJW"};
    public static final Parcelable.Creator<GeobFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A05;
            if (strArr[3].charAt(14) == strArr[4].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "S35uTAl8blKCIA6RDoKwUWKuPnlgGmXm";
            strArr2[4] = "SsAAbyTQ3GSJA95JV1WqS3o9zGFFtLED";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{111, 99, 39, 38, 48, 32, 49, 42, 51, 55, 42, 44, 45, 126, 118, 122, 60, 51, 54, 63, 52, 59, 55, 63, 103, 41, 51, 126, 122, 126, 118, 71, 106, 99, 118, 46, 104, 106, 96, 109};
    }

    static {
        A01();
        CREATOR = new ER();
    }

    public GeobFrame(Parcel parcel) {
        super(A00(36, 4, 61));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(A00(36, 4, 61));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A05;
        if (strArr[0].charAt(21) != strArr[5].charAt(21)) {
            throw new RuntimeException();
        }
        A05[1] = "qpy6";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        String[] strArr2 = A05;
        if (strArr2[2].charAt(2) != strArr2[7].charAt(2)) {
            String[] strArr3 = A05;
            strArr3[0] = "ZxNtpKl8Qog9k8N9AfFsAobqqZJconha";
            strArr3[5] = "CevArDyiRACDVeaxwdL6do5tdD551HHN";
            if (C0695Iz.A0g(this.A02, geobFrame.A02)) {
                if (!C0695Iz.A0g(this.A01, geobFrame.A01) && C0695Iz.A0g(this.A00, geobFrame.A00) && Arrays.equals(this.A03, geobFrame.A03)) {
                    return true;
                }
            }
        } else if (C0695Iz.A0g(this.A02, geobFrame.A02)) {
            if (!C0695Iz.A0g(this.A01, geobFrame.A01)) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17 * 31;
        String str = this.A02;
        int result = str != null ? str.hashCode() : 0;
        int i2 = (i + result) * 31;
        String str2 = this.A01;
        int result2 = str2 != null ? str2.hashCode() : 0;
        int i3 = i2 + result2;
        if (A05[1].length() != 4) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[3] = "5eDn8afHXDuGLumtwhVuBGsgGShhwGUa";
        strArr[4] = "hfSsrwL4qnCDd3h6Kdz3LdbJUMkhTjAD";
        int i4 = i3 * 31;
        String str3 = this.A00;
        int iHashCode = str3 != null ? str3.hashCode() : 0;
        int result3 = Arrays.hashCode(this.A03);
        return ((i4 + iHashCode) * 31) + result3;
    }

    @Override // com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(25, 11, 1) + this.A02 + A00(14, 11, 72) + this.A01 + A00(0, 14, 81) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
