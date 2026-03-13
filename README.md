
&lt;div align="center"&gt;

# 🎒 MinerBackpack

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.20.1-62B47A?style=flat-square&amp;logo=minetest)](https://www.minecraft.net/)
[![Fabric Loader](https://img.shields.io/badge/Fabric%20Loader-0.18.4%2B-222831?style=flat-square&amp;logo=coffeescript)](https://fabricmc.net/)
[![Java Version](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&amp;logo=openjdk)](https://adoptium.net/)
[![License](https://img.shields.io/badge/License-GPL--3.0-blue?style=flat-square)](LICENSE)
[![Build Status](https://img.shields.io/github/actions/workflow/status/mcStarDream/MinerBackpack/build.yml?branch=main&amp;style=flat-square&amp;logo=github)](https://github.com/mcStarDream/MinerBackpack/actions)

矿工背包让你不再拥有满背包的烦恼！

</div&gt;

---

## 📖 简介

MinerBackpack 将各种矿物相关物品的堆叠上限提升到 9999，让你在挖矿时再也不用担心背包空间不够用的问题！

## ✨ 功能特性

- 🎯 **超高堆叠上限**：支持矿物相关物品堆叠至 9999 个
- 📦 **广泛覆盖**：包含所有主流矿物及制品
- 🚀 **简单易用**：安装即用，无需额外配置
- 🌐 **服务端友好**：同时支持客户端和服务端

### 📋 支持的物品列表

- ⚫ **铁矿**：铁矿石、深层铁矿石、粗铁、铁锭
- 🟤 **铜矿**：铜矿石、深层铜矿石、粗铜、铜锭
- 🟡 **金矿**：金矿石、深层金矿石、粗金、金锭、下界金矿石
- 🔩 **下界合金**：远古残骸、下界合金碎片
- 💎 **钻石矿**：钻石矿石、深层钻石矿石、钻石
- 🔵 **青金石矿**：青金石矿石、深层青金石矿石、青金石
- 🔴 **红石矿**：红石矿石、深层红石矿石、红石
- ⚪ **煤矿**：煤矿石、深层煤矿石、煤炭
- 💚 **绿宝石矿**：绿宝石矿石、深层绿宝石矿石、绿宝石
- ⬜ **下界石英**：下界石英矿石、石英

## 🔧 系统要求

| 依赖 | 版本要求 |
|------|----------|
| 🎮 Minecraft | 1.20.1 |
| 🧵 Fabric Loader | 0.18.4 或更高版本 |
| 📦 Fabric API | 需要安装 |
| ☕ Java | 17 或更高版本（开发环境使用 Java 21） |

## 📦 安装方法

1. ✅ 确保已安装 [Fabric Loader](https://fabricmc.net/use/) 和 [Fabric API](https://modrinth.com/mod/fabric-api)
2. 📥 下载最新版本的 MinerBackpack 模组文件
3. 📂 将模组文件放入 Minecraft 的 `mods` 文件夹
4. 🎮 启动游戏即可

## 👨‍💻 开发指南

### 🔨 环境配置

项目使用 Gradle 构建系统，以下是开发环境配置步骤：

```bash
# 克隆项目
git clone https://github.com/mcStarDream/MinerBackpack.git

# 进入项目目录
cd MinerBackpack

# 生成 IDE 运行配置
./gradlew genSources

# 构建项目
./gradlew build
```

### 🎮 运行游戏客户端

```bash
./gradlew runClient
```

### 🌐 运行游戏服务端

```bash
./gradlew runServer
```

## 📜 版本历史

详细的版本更新记录请查看 [CHANGELOG.md](CHANGELOG.md)。

## 👥 作者

- JasonShane
- mcStarDream

## 📄 许可证

本项目采用 GPL-3.0 许可证。详见 [LICENSE](LICENSE) 文件。

## 📞 联系方式

- 🏠 主页：https://github.com/mcStarDream
- 💻 源代码：https://github.com/mcStarDream/MinerBackpack

