from sinling import utils

BASE_CONSONANTS = [
    'ක', 'ඛ', 'ග', 'ඝ', 'ඞ', 'ඟ',
    'ච', 'ඡ', 'ජ', 'ඣ', 'ඤ', 'ඦ',
    'ට', 'ඨ', 'ඩ', 'ඪ', 'ණ', 'ඬ',
    'ත', 'ථ', 'ද', 'ධ', 'න', 'ඳ',
    'ප', 'ඵ', 'බ', 'භ', 'ම', 'ඹ',
    'ය', 'ර', 'ල', 'ව',
    'ශ', 'ෂ', 'ස', 'හ', 'ළ', 'ෆ',
]

SAN = [
    'ඟ', 'ඦ', 'ඬ', 'ඳ', 'ඹ'
]
# TODO: Check whether these are correct mappings
# ඟ = ඬ්ග, ඦ = ඤ්ජ, ඬ = ණ්ඩ, ඳ = න්ද, ඹ = ම්බ
# Resource: http://www.danuma.lk/sinhala/index.php?option=com_content&view=article&id=19234%3A2010-06-09-10-17-10&
# catid=110%3Aeducation&Itemid=76&lang=si
SAN_MAPPING = {'ඟ': 'ංග', 'ඦ': 'ඤ්ජ', 'ඬ': 'ණ්ඩ', 'ඳ': 'න්ද', 'ඹ': 'ම්බ'}
REVERSE_SAN_MAPPING = {d: v for v, d in SAN_MAPPING.items()}

CONSONANTS = [c + '්' for c in BASE_CONSONANTS]

VOWELS = [
    'අ', 'ආ', 'ඇ', 'ඈ', 'ඉ', 'ඊ', 'උ', 'ඌ',
    'ඍ', 'ඎ', 'එ', 'ඒ', 'ඓ', 'ඔ', 'ඕ', 'ඖ',
    'අං', 'අඃ',
]

VOWEL_DIACRITICS = [
    '', 'ා', 'ැ', 'ෑ', 'ි', 'ී', 'ු', 'ූ', 'ෘ',
    'ෲ', 'ෙ', 'ේ', 'ෛ', 'ො', 'ෝ', 'ෞ',
    'ං', 'ඃ'
]

LONG_TO_SHORT_VOWEL_DIACRITICS_MAPPING = {
    '': 'ා',
    'ෑ': 'ැ',
    'ී': 'ි',
    'ූ': 'ු',
    'ේ': 'ෙ',
    'ෝ': 'ො'
}

DIACRITICS_MAPPING = {v: d for v, d in zip(VOWELS, VOWEL_DIACRITICS)}

REVERSE_DIACRITICS_MAPPING = {d: v for v, d in zip(VOWELS, VOWEL_DIACRITICS)}

CONJUNCT_CONSONANTS = [
    'ක්ර', 'ඛ්ර', 'ග්ර', 'ඝ්ර', 'ඞ්ර', 'ඟ්ර',
    'ක්ය', 'ඛ්ය', 'ග්ය', 'ඝ්ය', 'ඞ්ය', 'ඟ්ය',
    'ක්ෂ', '෴',
]

NUMERALS = [
    '𑇡', '𑇢', '𑇣', '𑇤', '𑇥', '𑇦', '𑇧', '𑇨', '𑇩', '𑇪',
    '𑇫', '𑇬', '𑇭', '𑇮', '𑇯', '𑇰', '𑇱', '𑇲', '𑇳', '𑇴',
]

COMBINED_LETTERS = CONSONANTS + utils.combine(BASE_CONSONANTS, VOWEL_DIACRITICS)

COMBINED_SAN = SAN + utils.combine(SAN, VOWEL_DIACRITICS)

GOSHA_LETTERS = [
    'අ', 'ආ', 'ඇ', 'ඈ', 'ඉ', 'ඊ', 'උ', 'ඌ',
    'ඍ', 'ඎ', 'එ', 'ඒ', 'ඓ', 'ඔ', 'ඕ', 'ඖ',
    'අං', 'අඃ',
    'ග', 'ඝ', 'ඞ',
    'ජ', 'ඣ', 'ඤ',
    'ඩ', 'ඪ', 'ණ',
    'ද', 'ධ', 'න',
    'බ', 'භ', 'ම',
    'ය', 'ර', 'ල', 'ව',
    'හ'
]

AGOSHA_LETTERS = [
    'ක්', 'ඛ්',
    'ච්', 'ඡ්',
    'ට්', 'ඨ්',
    'ත්', 'ථ්',
    'ප්', 'ඵ්',
]

AGOSHA_TO_GOSHA_MAPPING = {
    'ක්': 'ග්',
    'ඛ්': 'ඝ්',
    'ච්': 'ජ්',
    'ඡ්': 'ඣ්',
    'ට්': 'ඩ්',
    'ඨ්': 'ඪ්',
    'ත්': 'ද්',
    'ථ්': 'ධ්',
    'ප්': 'බ්',
    'ඵ්': 'භ්',
}

