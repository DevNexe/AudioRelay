package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0M {
    public static byte[] A00;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{46, 33, 36, 45, 114, 103, 103};
    }

    public static int A00(BitmapFactory.Options options, int width, int inSampleSize) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int height = 1;
        if (i > inSampleSize || i2 > width) {
            int i3 = i / 2;
            int halfHeight = i2 / 2;
            while (halfWidth >= inSampleSize) {
                int halfWidth = halfHeight / height;
                if (halfWidth < width) {
                    break;
                }
                height *= 2;
            }
        }
        return height;
    }

    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A03(String str, int i, int i2, boolean z) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i > 0 && i2 > 0) {
                if (z) {
                    Bitmap bitmapA01 = A01(fileInputStream, i, i2);
                    A07(fileInputStream);
                    return bitmapA01;
                }
                Bitmap bitmapA02 = A02(str, i, i2);
                A07(fileInputStream);
                return bitmapA02;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return bitmapDecodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    @Nullable
    public static String A05(@Nullable File file) {
        if (file != null) {
            return A04(0, 7, 117) + file.getPath();
        }
        return null;
    }

    public static void A07(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
