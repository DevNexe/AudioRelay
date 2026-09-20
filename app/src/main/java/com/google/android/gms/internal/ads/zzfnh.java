package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnh {
    public static final void a(byte[] bArr, String str, zzfmf zzfmfVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfst.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfmfVar.zzb(4007, sb.toString());
    }

    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[Catch: IllegalAccessException -> 0x0108, NoSuchFieldException -> 0x010d, TryCatch #6 {IllegalAccessException -> 0x0108, NoSuchFieldException -> 0x010d, blocks: (B:50:0x00f2, B:52:0x0102, B:54:0x0105), top: B:107:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    /* JADX WARN: Code duplicated, block: B:93:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    public static final int zzb(Context context, zzfmf zzfmfVar) {
        int i;
        String str;
        String strZza;
        String[] strArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzfwy(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzfmfVar.zzb(5017, "No .so");
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                a(bArr, null, zzfmfVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    fileInputStream.close();
                                    i = 5;
                                } else if (s == 40) {
                                    fileInputStream.close();
                                    i = 3;
                                } else if (s == 62) {
                                    fileInputStream.close();
                                    i = 7;
                                } else if (s != 183) {
                                    a(bArr, null, zzfmfVar);
                                } else {
                                    fileInputStream.close();
                                    i = 6;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    a(null, e.toString(), zzfmfVar);
                }
                i = 1;
            }
            if (i == 1000) {
                HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                strZza = zzfst.OS_ARCH.zza();
                if (TextUtils.isEmpty(strZza) || !hashSet.contains(strZza)) {
                    try {
                        strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                        if (strArr != null || strArr.length <= 0) {
                            strZza = Build.CPU_ABI;
                            if (strZza == null) {
                                strZza = Build.CPU_ABI2;
                            }
                        } else {
                            strZza = strArr[0];
                        }
                    } catch (IllegalAccessException e2) {
                        zzfmfVar.zzc(2024, 0L, e2);
                    } catch (NoSuchFieldException e3) {
                        zzfmfVar.zzc(2024, 0L, e3);
                    }
                }
                if (TextUtils.isEmpty(strZza)) {
                    a(null, "Empty dev arch", zzfmfVar);
                } else if (!strZza.equalsIgnoreCase("i686") || strZza.equalsIgnoreCase("x86")) {
                    i = 5;
                } else if (strZza.equalsIgnoreCase("x86_64")) {
                    i = 7;
                } else if (strZza.equalsIgnoreCase("arm64-v8a")) {
                    i = 6;
                } else if (strZza.equalsIgnoreCase("armeabi-v7a") || strZza.equalsIgnoreCase("armv71")) {
                    i = 3;
                } else {
                    a(null, strZza, zzfmfVar);
                }
                i = 1;
            }
            if (i != 1) {
                str = "UNSUPPORTED";
            } else if (i != 3) {
                str = "ARM7";
            } else if (i != 5) {
                str = "X86";
            } else if (i != 6) {
                str = "ARM64";
            } else if (i != 7) {
                str = "null";
            } else {
                str = "X86_64";
            }
            zzfmfVar.zzb(5018, str);
            return i;
        }
        zzfmfVar.zzb(5017, "No lib/");
        i = AdError.NETWORK_ERROR_CODE;
        if (i == 1000) {
            HashSet hashSet2 = new HashSet(Arrays.asList("i686", "armv71"));
            strZza = zzfst.OS_ARCH.zza();
            if (TextUtils.isEmpty(strZza)) {
                strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    strZza = Build.CPU_ABI;
                    if (strZza == null) {
                        strZza = Build.CPU_ABI2;
                    }
                } else {
                    strZza = Build.CPU_ABI;
                    if (strZza == null) {
                        strZza = Build.CPU_ABI2;
                    }
                }
            } else {
                strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    strZza = Build.CPU_ABI;
                    if (strZza == null) {
                        strZza = Build.CPU_ABI2;
                    }
                } else {
                    strZza = Build.CPU_ABI;
                    if (strZza == null) {
                        strZza = Build.CPU_ABI2;
                    }
                }
            }
            if (TextUtils.isEmpty(strZza)) {
                a(null, "Empty dev arch", zzfmfVar);
            } else if (strZza.equalsIgnoreCase("i686")) {
                i = 5;
            } else {
                i = 5;
            }
            i = 1;
        }
        if (i != 1) {
            str = "UNSUPPORTED";
        } else if (i != 3) {
            str = "ARM7";
        } else if (i != 5) {
            str = "X86";
        } else if (i != 6) {
            str = "ARM64";
        } else if (i != 7) {
            str = "null";
        } else {
            str = "X86_64";
        }
        zzfmfVar.zzb(5018, str);
        return i;
    }
}
