package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import defpackage.XTd3;
import defpackage.lk0;
import defpackage.xe3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class CQf {
    public static final QnHx a = new QnHx();
    public static final C0027CQf b = new C0027CQf();

    /* JADX INFO: renamed from: androidx.profileinstaller.CQf$CQf, reason: collision with other inner class name */
    public class C0027CQf implements F1 {
        @Override // androidx.profileinstaller.CQf.F1
        public final void a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    public interface F1 {
        void a(int i, Object obj);
    }

    public class QnHx implements F1 {
        @Override // androidx.profileinstaller.CQf.F1
        public final void a(int i, Object obj) {
        }
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0187 A[Catch: all -> 0x018d, TRY_ENTER, TryCatch #24 {all -> 0x018d, blocks: (B:97:0x016a, B:99:0x0176, B:103:0x0187, B:104:0x018c), top: B:249:0x016a, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01db A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #12 {all -> 0x01f0, blocks: (B:136:0x01cf, B:138:0x01db, B:141:0x01e6), top: B:238:0x01cf, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e6 A[Catch: all -> 0x01f0, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01f0, blocks: (B:136:0x01cf, B:138:0x01db, B:141:0x01e6), top: B:238:0x01cf, outer: #31 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x020a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0214  */
    /* JADX WARN: Code duplicated, block: B:162:0x0217  */
    /* JADX WARN: Code duplicated, block: B:170:0x0231  */
    /* JADX WARN: Code duplicated, block: B:214:0x0280  */
    /* JADX WARN: Code duplicated, block: B:218:0x028a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0290  */
    /* JADX WARN: Code duplicated, block: B:258:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0238 A[EDGE_INSN: B:263:0x0238->B:174:0x0238 BREAK  A[LOOP:0: B:168:0x022b->B:171:0x0232], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103 A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #26 {all -> 0x0114, blocks: (B:49:0x00f9, B:51:0x0103, B:57:0x0116, B:58:0x011b), top: B:252:0x00f9, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0114, TRY_ENTER, TryCatch #26 {all -> 0x0114, blocks: (B:49:0x00f9, B:51:0x0103, B:57:0x0116, B:58:0x011b), top: B:252:0x00f9, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0176 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #24 {all -> 0x018d, blocks: (B:97:0x016a, B:99:0x0176, B:103:0x0187, B:104:0x018c), top: B:249:0x016a, outer: #32 }] */
    public static void b(Context context, Executor executor, F1 f1, boolean z) {
        boolean z2;
        byte[] bArr;
        F1 f2;
        lk0[] lk0VarArr;
        byte[] bArr2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i;
        boolean z3;
        ByteArrayOutputStream byteArrayOutputStream;
        lk0[] lk0VarArr2;
        int i2;
        boolean z4;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        FileInputStream fileInputStreamCreateInputStream;
        AssetFileDescriptor assetFileDescriptorOpenFd2;
        FileInputStream fileInputStreamCreateInputStream2;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                f1.a(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.QnHx qnHx = new androidx.profileinstaller.QnHx(assets, executor, f1, name, file2);
            byte[] bArr4 = qnHx.c;
            if (bArr4 != null) {
                if (file2.canWrite()) {
                    qnHx.e = true;
                    z2 = true;
                } else {
                    qnHx.a(4, null);
                }
                if (z2) {
                    if (qnHx.e) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    bArr = xe3.a;
                    if (bArr4 != null) {
                        try {
                            assetFileDescriptorOpenFd2 = assets.openFd("dexopt/baseline.prof");
                            try {
                                fileInputStreamCreateInputStream2 = assetFileDescriptorOpenFd2.createInputStream();
                                try {
                                    if (Arrays.equals(bArr, XTd3.s(fileInputStreamCreateInputStream2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    qnHx.f = xe3.h(fileInputStreamCreateInputStream2, XTd3.s(fileInputStreamCreateInputStream2, 4), name);
                                    fileInputStreamCreateInputStream2.close();
                                    assetFileDescriptorOpenFd2.close();
                                    lk0VarArr2 = qnHx.f;
                                    if (lk0VarArr2 != null) {
                                        i2 = Build.VERSION.SDK_INT;
                                        if (i2 < 24 && (i2 == 24 || i2 == 25 || i2 == 31)) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            try {
                                                assetFileDescriptorOpenFd = assets.openFd("dexopt/baseline.profm");
                                                try {
                                                    fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                                                    try {
                                                        if (Arrays.equals(xe3.b, XTd3.s(fileInputStreamCreateInputStream, 4))) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        qnHx.f = xe3.e(fileInputStreamCreateInputStream, XTd3.s(fileInputStreamCreateInputStream, 4), bArr4, lk0VarArr2);
                                                        fileInputStreamCreateInputStream.close();
                                                        assetFileDescriptorOpenFd.close();
                                                    } catch (Throwable th4) {
                                                        if (fileInputStreamCreateInputStream == null) {
                                                            throw th4;
                                                        }
                                                        try {
                                                            fileInputStreamCreateInputStream.close();
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            th4.addSuppressed(th5);
                                                            throw th4;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    if (assetFileDescriptorOpenFd == null) {
                                                        throw th6;
                                                    }
                                                    try {
                                                        assetFileDescriptorOpenFd.close();
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th6.addSuppressed(th7);
                                                        throw th6;
                                                    }
                                                }
                                            } catch (FileNotFoundException e) {
                                                f1.a(9, e);
                                            } catch (IOException e2) {
                                                f1.a(7, e2);
                                            } catch (IllegalStateException e3) {
                                                qnHx.f = null;
                                                f1.a(8, e3);
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    if (fileInputStreamCreateInputStream2 == null) {
                                        throw th8;
                                    }
                                    try {
                                        fileInputStreamCreateInputStream2.close();
                                        throw th8;
                                    } catch (Throwable th9) {
                                        th8.addSuppressed(th9);
                                        throw th8;
                                    }
                                }
                            } catch (Throwable th10) {
                                if (assetFileDescriptorOpenFd2 == null) {
                                    throw th10;
                                }
                                try {
                                    assetFileDescriptorOpenFd2.close();
                                    throw th10;
                                } catch (Throwable th11) {
                                    th10.addSuppressed(th11);
                                    throw th10;
                                }
                            }
                        } catch (FileNotFoundException e4) {
                            f1.a(6, e4);
                        } catch (IOException e5) {
                            f1.a(7, e5);
                        } catch (IllegalStateException e6) {
                            f1.a(8, e6);
                        }
                    }
                    f2 = qnHx.b;
                    lk0VarArr = qnHx.f;
                    if (lk0VarArr != null && bArr4 != null) {
                        if (qnHx.e) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (xe3.j(byteArrayOutputStream, bArr4, lk0VarArr)) {
                                    qnHx.g = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    qnHx.f = null;
                                } else {
                                    f2.a(5, null);
                                    qnHx.f = null;
                                    byteArrayOutputStream.close();
                                }
                            } catch (Throwable th12) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th12;
                                } catch (Throwable th13) {
                                    th12.addSuppressed(th13);
                                    throw th12;
                                }
                            }
                        } catch (IOException e7) {
                            f2.a(7, e7);
                        } catch (IllegalStateException e8) {
                            f2.a(8, e8);
                        }
                    }
                    bArr2 = qnHx.g;
                    if (bArr2 == null) {
                        try {
                            if (qnHx.e) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream(qnHx.d);
                                        try {
                                            try {
                                                bArr3 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                                                while (true) {
                                                    i = byteArrayInputStream.read(bArr3);
                                                    if (i > 0) {
                                                        break;
                                                    }
                                                    try {
                                                        fileOutputStream.write(bArr3, 0, i);
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                    th = th14;
                                                    th = th;
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th;
                                                    } catch (Throwable th15) {
                                                        th.addSuppressed(th15);
                                                        throw th;
                                                    }
                                                }
                                                qnHx.a(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                qnHx.g = null;
                                                qnHx.f = null;
                                                z3 = true;
                                                if (z3) {
                                                    a(packageInfo, filesDir);
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            Throwable th18 = th;
                                            try {
                                                byteArrayInputStream.close();
                                                throw th18;
                                            } catch (Throwable th19) {
                                                th18.addSuppressed(th19);
                                                throw th18;
                                            }
                                        }
                                    } catch (Throwable th20) {
                                        th = th20;
                                    }
                                } catch (FileNotFoundException e9) {
                                    e = e9;
                                    qnHx.a(6, e);
                                    qnHx.g = null;
                                    qnHx.f = null;
                                    z3 = false;
                                } catch (IOException e10) {
                                    e = e10;
                                    qnHx.a(7, e);
                                    qnHx.g = null;
                                    qnHx.f = null;
                                    z3 = false;
                                }
                            } catch (FileNotFoundException e11) {
                                e = e11;
                                qnHx.a(6, e);
                                qnHx.g = null;
                                qnHx.f = null;
                                z3 = false;
                            } catch (IOException e12) {
                                e = e12;
                                qnHx.a(7, e);
                                qnHx.g = null;
                                qnHx.f = null;
                                z3 = false;
                            }
                        } catch (Throwable th21) {
                            qnHx.g = null;
                            qnHx.f = null;
                            throw th21;
                        }
                    }
                    z3 = false;
                    if (z3) {
                        a(packageInfo, filesDir);
                    }
                }
                return;
            }
            qnHx.a(3, Integer.valueOf(i3));
            z2 = false;
            if (z2) {
                return;
            }
            if (qnHx.e) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            bArr = xe3.a;
            if (bArr4 != null) {
                assetFileDescriptorOpenFd2 = assets.openFd("dexopt/baseline.prof");
                fileInputStreamCreateInputStream2 = assetFileDescriptorOpenFd2.createInputStream();
                if (Arrays.equals(bArr, XTd3.s(fileInputStreamCreateInputStream2, 4))) {
                    throw new IllegalStateException("Invalid magic");
                }
                qnHx.f = xe3.h(fileInputStreamCreateInputStream2, XTd3.s(fileInputStreamCreateInputStream2, 4), name);
                fileInputStreamCreateInputStream2.close();
                assetFileDescriptorOpenFd2.close();
                lk0VarArr2 = qnHx.f;
                if (lk0VarArr2 != null) {
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 < 24) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        assetFileDescriptorOpenFd = assets.openFd("dexopt/baseline.profm");
                        fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                        if (Arrays.equals(xe3.b, XTd3.s(fileInputStreamCreateInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        qnHx.f = xe3.e(fileInputStreamCreateInputStream, XTd3.s(fileInputStreamCreateInputStream, 4), bArr4, lk0VarArr2);
                        fileInputStreamCreateInputStream.close();
                        assetFileDescriptorOpenFd.close();
                    }
                }
            }
            f2 = qnHx.b;
            lk0VarArr = qnHx.f;
            if (lk0VarArr != null) {
                if (qnHx.e) {
                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(bArr4);
                if (xe3.j(byteArrayOutputStream, bArr4, lk0VarArr)) {
                    f2.a(5, null);
                    qnHx.f = null;
                    byteArrayOutputStream.close();
                } else {
                    qnHx.g = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    qnHx.f = null;
                }
            }
            bArr2 = qnHx.g;
            if (bArr2 == null) {
                if (qnHx.e) {
                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                }
                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                fileOutputStream = new FileOutputStream(qnHx.d);
                bArr3 = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                while (true) {
                    i = byteArrayInputStream.read(bArr3);
                    if (i > 0) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr3, 0, i);
                    th = th14;
                    th = th;
                    fileOutputStream.close();
                    throw th;
                }
                qnHx.a(1, null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                qnHx.g = null;
                qnHx.f = null;
                z3 = true;
                if (z3) {
                    a(packageInfo, filesDir);
                }
            }
            z3 = false;
            if (z3) {
                a(packageInfo, filesDir);
            }
        } catch (PackageManager.NameNotFoundException e13) {
            f1.a(7, e13);
        }
    }
}
