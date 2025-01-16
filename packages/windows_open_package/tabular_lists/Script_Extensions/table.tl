name: Script_Extensions_Open
fields:
    - extension:
          primaryKey: true
          index: true
          nullable: false
          type: Regex
          unique: true
fillType: Registry
type: 1
userCanEditContent: true
defaults:
    PT:
        - extension: \.bat\b
        - extension: \.cmd\b
        - extension: \.js\b
        - extension: \.jse\b
        - extension: \.ps1\b
        - extension: \.psm1\b
        - extension: \.sct\b
        - extension: \.scr\b
        - extension: \.vbs\b
        - extension: \.vbe\b
        - extension: \.wsc\b
        - extension: \.wfs\b
        - extension: \.wsh\b
        - extension: \.wsf\b
        - extension: \.py\b
        